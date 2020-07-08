import  requests
import re

header = {
    'user-agent':'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36 Edge/18.18362'#克制反爬
}
# f=open('./haha.txt',mode='w',encoding='utf-8')
# f.write(requests.get("https://www.vmgirls.com/14094.html",headers=header).text)
r=requests.get("https://www.vmgirls.com/14094.html",headers=header)
html=r.text
urls=re.findall('<a href="(.*?)" alt=".*?" title=".*?">',html)
print(urls)
for url in urls:
    filename='./longgefuli/'+url.split('/')[-1]
    response=requests.get(url,headers=header)
    with open(filename,'wb') as f:
        f.write(response.content)

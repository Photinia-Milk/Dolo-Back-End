import requests
import re
header = {
    'Accept':'text/html, application/xhtml+xml, image/jxr, */*',
    'Accept-Language':'zh-CN',
    'User-Agent':'Mozilla/5.0 (Windows NT 10.0; WOW64; Trident/7.0; rv:11.0) like Gecko',
    'Accept-Encoding':'gzip, deflate',
    'Host':'i.sjtu.edu.cn',
    'Cookie':'_ga=GA1.3.982897536.1536483441; JSESSIONID=9BC4F5FC11B0F8C580EEADF5CA61151A',
    'Connection':'keep-alive'
}

header1={
    'Content-Length':'0',
    'User-Agent':'Mozilla/5.0 (Windows NT 10.0; WOW64; Trident/7.0; rv:11.0) like Gecko',
    'Host':'i.sjtu.edu.cn',
    'Proxy-Connect':'Keep-Alive',
    'Pragma':'no-cache'
}

header2={
    'User-Agent':'Post_Multipart',
    'Host':'36.99.30.87',
    'Accept':'*/*',
    'Pragma':'no-cache',
    'X-360-Cloud-Security-Desc':'Scan Suspicious File',
    'x-360-ver':'4',
    'Content-Length':'754',
    'Content-Type':'multipart/form-data; boundary=----------------------------a61de83ec68b',
    'Connection':'keep-alive'
}

header3:{
    'Host':'i.sjtu.edu.cn:443',
    'Proxy-Connection':	'keep-alive',
    'User-Agent':'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.130 Safari/537.36'
}

r=requests.post('https://i.sjtu.edu.cn/js/comp/jwglxt/xkgl/xsxk/zzxkYzb.js?ver=20200701',headers=header2)
print(r.headers)
# f=open('./try.txt',mode='w',encoding='utf-8')
# f.write(r.text)

# f=open('./haha.txt',mode='w',encoding='utf-8')
# f.write(requests.get("https://i.sjtu.edu.cn/xsxk/zzxkyzb_cxZzxkYzbIndex.html?gnmkdm=N253512&layout=default&su=518030910064",headers=header1).text)

# r=requests.get('https://i.sjtu.edu.cn/xtgl/index_initMenu.html?jsdm=xs&_t=1594102699864',headers=header)
# print(r.text)


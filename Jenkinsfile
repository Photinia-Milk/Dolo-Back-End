node{
	stage('SCM Checkout'){
		git 'https://github.com/Photinia-Milk/Dolo-Back-End'
		sh 'mysql -uroot -proot -Dcourse < ./course.sql'
	}
	stage('set up test data'){
		sh 'mysql -uroot -proot -Dcourse < ./course.sql'
	}
	stage('Compile-Package'){
		sh 'mvn package'
	}
}
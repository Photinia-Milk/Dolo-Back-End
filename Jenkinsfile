node{
	stage('SCM Checkout'){
		git 'https://github.com/Photinia-Milk/Dolo-Back-End'
	}
	stage('set up test data'){
		sh 'mysql -uroot -proot -Dcourse < course.sql'
	}
	stage('Compile-Package'){
		sh 'mvn package'
	}
}
node{
	stage('SCM Checkout'){
		git 'https://github.com/Photinia-Milk/Dolo-Back-End'
	}
	stage('set up test data'){
		sh 'mysql -uroot -proot'
		sh 'use course'
		sh 'source course.sql'
		sh 'quit'
	}
	stage('Compile-Package'){
		sh 'mvn package'
	}
}
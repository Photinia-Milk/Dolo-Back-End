node{
	stage('Checkout Integration'){
	    sh 'git pull https://github.com/Photinia-Milk/Dolo-Back-End feat_integration'
	    sh 'git checkout feat_integration'
	}
	stage('set up test data'){
		sh 'mysql -uroot -proot -Dcourse < ./resources/course.sql'
		sh 'mysql -uroot -proot -Dcourse < ./resources/testdata.sql'
	}
	stage('Compile-Package'){
		sh 'mvn package'
	}
}
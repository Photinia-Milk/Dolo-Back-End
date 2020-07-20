node{
	stage('Checkout Integration'){
	    sh 'git pull https://github.com/Photinia-Milk/Dolo-Back-End feat_integration'
	    sh 'git checkout feat_integration'
	}
	stage('set up test data'){
		sh 'mysql -uroot -proot -Dcourse < ./resources/courseTest.sql'
	}
	stage('Compile-Package'){
		sh 'mvn package'
	}
}
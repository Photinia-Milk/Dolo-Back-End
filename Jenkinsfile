node{
	stage('Checkout Integration'){
	    sh 'git pull https://github.com/Photinia-Milk/Dolo-Back-End develop'
	    sh 'git checkout develop'
	}
	stage('Set up test data'){
		sh 'mysql -uroot -proot -Dcourse2 < ./resources/course2.sql'
	}
	stage('Test'){
		sh 'mvn test'
	}
	stage('Compile-Package'){
		sh 'mvn package'
	}
	stage('Pack Docker img'){
		sh 'docker ps'
		sh 'docker build -t dolo:back-end .'
	}
}

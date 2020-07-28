node{
	stage('Checkout Integration'){
	    sh 'git pull https://github.com/Photinia-Milk/Dolo-Back-End develop'
	    sh 'git checkout develop'
	}
	stage('Set up test data'){
		sh 'mysql -uroot -proot -Dcourse2 < ./resources/course2.2.0/course.sql'
	}
	stage('Test'){
		sh 'mvn test'
	}
	stage('Compile-Package'){
		sh 'mvn package'
	}
	stage('Pack Docker img'){
		sh 'docker build -t dolo:back-end .'
		sh 'docker ps'
	}
	stage('Deploy docker img'){
	    sh 'docker rm -f dolo-back-end' 
	    sh 'docker run -d --name dolo-back-end --network host dolo:back-end'
	    sh 'docker ps -a'
	}
}

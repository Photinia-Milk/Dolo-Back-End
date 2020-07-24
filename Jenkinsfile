node{
	stage('Checkout Integration'){
	    sh 'git pull https://github.com/Photinia-Milk/Dolo-Back-End feat_integration'
	    sh 'git checkout feat_integration'
	}
	stage('Set up test data'){
		sh 'mysql -uroot -proot -Dcourse2 < ./resources/1-addCourseTime.sql'
		sh 'mysql -uroot -proot -Dcourse2 < ./resources/2-course.sql'
		sh 'mysql -uroot -proot -Dcourse2 < ./resources/3-userauth.sql'
		sh 'mysql -uroot -proot -Dcourse2 < ./resources/4-teacher.sql'
		sh 'mysql -uroot -proot -Dcourse2 < ./resources/5-timeslot.sql'
		sh 'mysql -uroot -proot -Dcourse2 < ./resources/6-sectionAddCourseTime.sql'
		sh 'mysql -uroot -proot -Dcourse2 < ./resources/7-sectime.sql'
		sh 'mysql -uroot -proot -Dcourse2 < ./resources/8-student.sql'

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

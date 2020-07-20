node{
	stage('SCM Checkout'){
		git 'https://github.com/Photinia-Milk/Dolo-Back-End'
	}
	stage('Compile-Package'){
		sh 'mvn package'
	}
}
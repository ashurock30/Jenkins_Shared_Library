def call(String branch_name) {
 
    checkout([
        $class: 'GitSCM',
        branches: [[name:  "${branch_name}" ]],
        userRemoteConfigs: [[ url: "https://github.com/ashurock30/DevOps_Project_Docker.git" ]]
    ])
  }
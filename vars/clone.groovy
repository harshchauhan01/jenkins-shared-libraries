def call(String url, String branch){
  echo 'Clonning...'
  git url: url, branch: branch
  echo "Cloned Successfully"
}

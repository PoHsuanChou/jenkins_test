def call(String executor){
    script {
        if ( executor == "Ithome" ){
            echo "Hi Ben dev"
        } else if (executor == "Jenkins" ){
            echo "Hi Jenkins dev"
        } else {
            echo "unrecognizable dev"
        }
    }
}

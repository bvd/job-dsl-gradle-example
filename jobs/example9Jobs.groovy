

println '>>>>> exec ex 9'

// this works
def doSomething(){
    println('------hello from method doSomething-------')
    folder('folderName') {
        description 'creating folder great success'
    }
}

doSomething()

doSomethingElse()
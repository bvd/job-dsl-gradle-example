import com.dslexample.XamarinJobBuilder

println '>>>>> executing trxJobs.groovy'

new XamarinJobBuilder(
        gitUrl: 'https://nsr-it-repos.dev.infosupport.net/scm/git/NS_CCMTRX',
        projectName: "Trx"
).build(this)

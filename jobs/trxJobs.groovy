import com.dslexample.XamarinJobBuilder

println '>>>>> executing trxJobs.groovy'

new XamarinJobBuilder(
        gitUrl: 'https://nsr-it-repos.dev.infosupport.net/scm/git/NS_CCMTRX',
        projectName: "Trx",
        environments: [
                [environment: "Ontwikkel", scmTrigger: "H/30 * * * *", branch: "develop"],
                [environment: "Test"],
                [environment: "Acceptatie"],
        ]

).build(this)

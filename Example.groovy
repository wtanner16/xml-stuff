
// 6-Aug-2017
// Example.groovy- simple groovy example for parsing and xml file


import groovy.xml.MarkupBuilder; // currently doesn't use this class.....yet

class Example {

    // location of xml file
    static String xmlFile = "/home/wjt/IdeaProjects/GroovyExample1/src/books.xml"

static main(args) {

    // want to make sure the xml file exists
    try {

        // define an xmlslurper object
        def catalog = new XmlSlurper().parse(new File(xmlFile))

        // print the names of the authors to the console
        catalog.book.author.each {
            println it

        }
    } catch(FileNotFoundException ex) {
        println("oops! Are you sure this file exists?")

    }

    }
    }


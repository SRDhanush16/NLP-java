package org.dhanush;

import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.Properties;

public class Pipeline {

    private static StanfordCoreNLP standfordCoreNLP;
    private static Properties properties;
    private static String propertiesName = "tokenize,ssplit,pos,lemma,ner,parse,sentiment";

    private Pipeline(){

    }

    static{
        properties = new Properties();
        properties.setProperty("annotators",propertiesName);
    }

    public static StanfordCoreNLP getPipeline(){
        if(standfordCoreNLP == null){
            standfordCoreNLP = new StanfordCoreNLP(properties);
        }
        return standfordCoreNLP;
    }


}

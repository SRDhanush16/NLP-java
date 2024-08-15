package org.dhanush;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();


        String text = "Hey! This is Dhanush S R . I'm doing B.Tech in CSE at VIT Chennai . ";
        String text2 = "Hey! My name is Dhanush and I have a brother his name is Kathir . " +
                "We both are born in Chennai . "; // Named Entity recognition
        String text3 = "The dessert was nice . The food was not very good"; // sentiment anaylsis

        //CoreDocument coreDocument = new CoreDocument(text);
        CoreDocument coreDocument = new CoreDocument(text3); // for Named Entity Recognition
        stanfordCoreNLP.annotate(coreDocument);

        // List<CoreLabel> coreLabelList = coreDocument.tokens();
        // for(CoreLabel c : coreLabelList){
        //     System.out.println(c.originalText());
        // }

        /*
        // find sentences
        * List<CoreSentence> coreSentences = coreDocument.sentences();
        for (CoreSentence sentence : coreSentences) {
            System.out.println(sentence.toString());
        }
        * */

        /*
        // Parts of Speech
        * List<CoreLabel> coreLabelList = coreDocument.tokens();
        for(CoreLabel c: coreLabelList){
            String pos = c.get(CoreAnnotations.PartOfSpeechAnnotation.class);
            System.out.println(c.originalText()+"="+pos);
        }
        * */

        /*
        * // Lemmatization
        List<CoreLabel> coreLabelList = coreDocument.tokens();
        for(CoreLabel coreLabel : coreLabelList){
            String lemma = coreLabel.lemma();
            System.out.println(coreLabel.originalText()+" = "+lemma);
        }
        *  */

        /*
        * // Named Entity Recognition
        List<CoreLabel> coreLabelList = coreDocument.tokens();
        for(CoreLabel coreLabel : coreLabelList){
            String ner = coreLabel.get(CoreAnnotations.NamedEntityTagAnnotation.class);
            System.out.println(coreLabel.originalText()+" = "+ner);
        }
        * */

        // sentiment analysis
        List<CoreSentence> sentences = coreDocument.sentences();
        for(CoreSentence sentence : sentences){
            String sentiment = sentence.sentiment();
            System.out.println(sentiment + "\t" + sentence);
        }




    }
}

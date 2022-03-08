import java.util.*;

class RnaTranscription {

    String transcribe(String dnaStrand) {
        String rnaStrand="";
        char [] dna = dnaStrand.toCharArray();
        for(int i=0;i<dna.length;i++){
            if(dna[i]=='G')
                rnaStrand+="C";
            else if(dna[i]=='C')
                rnaStrand+="G";
            else if(dna[i]=='T')
                rnaStrand+="A";
            else if(dna[i]=='A')
                rnaStrand+="U";
        }
    return rnaStrand;
    }

}

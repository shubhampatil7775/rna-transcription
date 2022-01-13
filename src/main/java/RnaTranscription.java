class RnaTranscription {


    String transcribe(String dnaStrand) {
        String toreturn="";
        for(int i=0;i<dnaStrand.length();i++)
        {
            char temp=dnaStrand.charAt(i);
            switch (temp)
            {
                case 'G':
                    toreturn+="C";
                    break;
                case 'C':
                    //System.out.println("In C");
                    toreturn+="G";
                    break;
                case 'T':
                    toreturn+="A";
                    break;
                case 'A':
                    toreturn+="U";
                    break;
            }
            //System.out.println(toreturn);
        }

        return toreturn;
    }


}

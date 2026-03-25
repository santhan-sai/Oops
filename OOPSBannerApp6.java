
     public class OOPSBannerApp6 {
    
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;
        
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
        
        public char getCharacter() {
            return character;
        }
        
        public String[] getPattern() {
            return pattern;
        }
    }
    
    public static CharacterPatternMap[] createCharacterPatternMaps() {
        CharacterPatternMap[] characterPatternMap = new CharacterPatternMap[4];
        
        String[] oPattern = {
            " ** ",
            "*    *",
            "*    *",
            "*    *",
            "*    *",
            "*    *",
            " ** "
        };
        characterPatternMap[0] = new CharacterPatternMap('O', oPattern);
        
        String[] pPattern = {
            "*** ",
            "*    *",
            "*    *",
            "*** ",
            "*     ",
            "*     ",
            "*     "
        };
        characterPatternMap[1] = new CharacterPatternMap('P', pPattern);
        
        String[] sPattern = {
            " ***",
            "*     ",
            "*     ",
            " ***",
            "     *",
            "     *",
            " ***"
        };
        characterPatternMap[2] = new CharacterPatternMap('S', sPattern);
        
        String[] spacePattern = {
            "      ",
            "      ",
            "      ",
            "      ",
            "      ",
            "      ",
            "      "
        };
        characterPatternMap[3] = new CharacterPatternMap(' ', spacePattern);
        
        return characterPatternMap;
    }
    
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return getCharacterPattern(' ', charMaps);
    }
    
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        String[] patterns[] = new String[message.length()];
        for (int i = 0; i < message.length(); i++) {
            patterns[i] = getCharacterPattern(message.charAt(i), charMaps);
        }
        
        for (int line = 0; line < 7; line++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < message.length(); i++) {
                sb.append(patterns[i][line]);
                if (i < message.length() - 1) {
                    sb.append(" ");
                }
            }
            System.out.println(sb.toString());
        }
    }
    
    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        String message = "OOPS";
        printMessage(message, charMaps);
    }
}
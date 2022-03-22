package MyCod.StudySkillbox.Modul_13_8;


import java.util.Map;
import java.util.function.Function;

public class TextFormat {

    Map<SyntaxFormat, Function<String, String>> syntaxMaping =
            Map.of(
                    SyntaxFormat.MD, (s) -> "**" + s + "**",
                    SyntaxFormat.HTML, (s) -> boldHtml(s),
                    SyntaxFormat.BB, (s) -> "[b]" + s + "[/b]"

            );

    public String bold(String text, SyntaxFormat syntaxFormat) {

        return syntaxMaping.get(syntaxFormat).apply(text);
    }

    private String boldMd(String text) {
        return "**" + text + "**";
    }

    private String boldHtml(String text) {
        return "<strong>";
    }

    public enum SyntaxFormat {
        MD, HTML, BB;
    }
}

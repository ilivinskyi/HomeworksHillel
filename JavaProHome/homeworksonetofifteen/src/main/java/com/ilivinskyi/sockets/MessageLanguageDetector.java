package sockets;

import static com.github.pemistahl.lingua.api.Language.RUSSIAN;
import static com.github.pemistahl.lingua.api.Language.UKRAINIAN;

import com.github.pemistahl.lingua.api.Language;
import com.github.pemistahl.lingua.api.LanguageDetector;
import com.github.pemistahl.lingua.api.LanguageDetectorBuilder;

public class MessageLanguageDetector {

    public String getLanguage(String text) {
        final LanguageDetector detector = LanguageDetectorBuilder
            .fromLanguages(RUSSIAN, UKRAINIAN)
            .withMinimumRelativeDistance(0.1)
            .build();
        final Language detectedLanguage = detector.detectLanguageOf(text);
        return detectedLanguage.name();
    }
}

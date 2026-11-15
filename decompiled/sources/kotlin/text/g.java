package kotlin.text;

import java.util.regex.Matcher;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {
    /* JADX INFO: Access modifiers changed from: private */
    public static final MatchResult c(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new f(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntRange d(java.util.regex.MatchResult matchResult, int i10) {
        return kotlin.ranges.b.n(matchResult.start(i10), matchResult.end(i10));
    }
}

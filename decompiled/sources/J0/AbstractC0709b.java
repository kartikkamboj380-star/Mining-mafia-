package J0;

import android.webkit.WebResourceError;

/* JADX INFO: renamed from: J0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0709b {
    public static CharSequence a(WebResourceError webResourceError) {
        return webResourceError.getDescription();
    }

    public static int b(WebResourceError webResourceError) {
        return webResourceError.getErrorCode();
    }
}

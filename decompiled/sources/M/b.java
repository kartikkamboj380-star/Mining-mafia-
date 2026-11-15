package M;

import android.text.Html;
import android.text.Spanned;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    static class a {
        static Spanned a(String str, int i10) {
            return Html.fromHtml(str, i10);
        }
    }

    public static Spanned a(String str, int i10) {
        return a.a(str, i10);
    }
}

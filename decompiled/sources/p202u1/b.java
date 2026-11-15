package p202u1;

import android.webkit.JavascriptInterface;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f49772c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f49773d = "function parseForm(form){\n\n    var values = '';\n    for(var i=0 ; i< form.elements.length; i++){\n        values +=\n            form.elements[i].name +\n            '=' +\n            form.elements[i].value +\n            '|'\n    }\n    FormInterceptorInterface.processFormData(values);\n}\n\n\nfor(var i=0 ; i< document.forms.length ; i++){\n    parseForm(document.forms[i]);\n}";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f49774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f49775b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return b.f49773d;
        }

        private a() {
        }
    }

    public b(String expectedState, Function1 callback) {
        Intrinsics.checkNotNullParameter(expectedState, "expectedState");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f49774a = expectedState;
        this.f49775b = callback;
    }

    @JavascriptInterface
    public final void processFormData(@NotNull String formData) {
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Intrinsics.checkNotNullParameter(formData, "formData");
        List listSplit$default = StringsKt.split$default(formData, new String[]{"|"}, false, 0, 6, null);
        Iterator it = listSplit$default.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!StringsKt.J((String) next, "id_token", false, 2, null));
        String str = (String) next;
        Iterator it2 = listSplit$default.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!StringsKt.J((String) next2, "code", false, 2, null));
        String str2 = (String) next2;
        Iterator it3 = listSplit$default.iterator();
        do {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
        } while (!StringsKt.J((String) next3, "state", false, 2, null));
        String str3 = (String) next3;
        Iterator it4 = listSplit$default.iterator();
        do {
            if (!it4.hasNext()) {
                next4 = null;
                break;
            }
            next4 = it4.next();
        } while (!StringsKt.J((String) next4, "user", false, 2, null));
        String str4 = (String) next4;
        if (str3 == null || (str2 == null && str == null && str4 == null)) {
            this.f49775b.invoke(g.a.f49778a);
            return;
        }
        String strH0 = StringsKt.H0(str3, "=", null, 2, null);
        String strH1 = str2 != null ? StringsKt.H0(str2, "=", null, 2, null) : null;
        String strH2 = str != null ? StringsKt.H0(str, "=", null, 2, null) : null;
        String strH3 = str4 != null ? StringsKt.H0(str4, "=", null, 2, null) : null;
        if (!Intrinsics.b(strH0, this.f49774a)) {
            this.f49775b.invoke(new g.b(new IllegalArgumentException("state does not match")));
            return;
        }
        Function1 function1 = this.f49775b;
        if (strH1 == null) {
            strH1 = "";
        }
        if (strH2 == null) {
            strH2 = "";
        }
        if (strH3 == null) {
            strH3 = "";
        }
        function1.invoke(new g.c(strH1, strH2, strH0, strH3));
    }
}

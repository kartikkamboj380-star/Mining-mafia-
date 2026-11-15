package I3;

import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import com.facebook.react.bridge.Callback;
import java.net.CookieHandler;
import java.net.URI;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.E;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p129m8.q;

/* JADX INFO: loaded from: classes.dex */
public final class d extends CookieHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f1627b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CookieManager f1628a;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(String str) {
            return StringsKt.y(str, "Set-cookie", true) || StringsKt.y(str, "Set-cookie2", true);
        }

        private a() {
        }
    }

    private final void b(String str, String str2) {
        CookieManager cookieManagerG = g();
        if (cookieManagerG != null) {
            cookieManagerG.setCookie(str, str2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Callback callback, Boolean bool) {
        callback.invoke(bool);
    }

    private final CookieManager g() {
        if (this.f1628a == null) {
            try {
                this.f1628a = CookieManager.getInstance();
            } catch (IllegalArgumentException | Exception unused) {
                return null;
            }
        }
        return this.f1628a;
    }

    public final void c(String url, List cookies) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(cookies, "cookies");
        Iterator it = cookies.iterator();
        while (it.hasNext()) {
            b(url, (String) it.next());
        }
        CookieManager cookieManagerG = g();
        if (cookieManagerG != null) {
            cookieManagerG.flush();
        }
    }

    public final void d(final Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        CookieManager cookieManagerG = g();
        if (cookieManagerG != null) {
            cookieManagerG.removeAllCookies(new ValueCallback() { // from class: I3.c
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    d.e(callback, (Boolean) obj);
                }
            });
        }
    }

    @Override // java.net.CookieHandler
    public Map get(URI uri, Map headers) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(headers, "headers");
        CookieManager cookieManagerG = g();
        String cookie = cookieManagerG != null ? cookieManagerG.getCookie(uri.toString()) : null;
        return (cookie == null || cookie.length() == 0) ? E.g() : E.e(q.a("Cookie", CollectionsKt.d(cookie)));
    }

    @Override // java.net.CookieHandler
    public void put(URI uri, Map headers) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(headers, "headers");
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        for (Map.Entry entry : headers.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (f1627b.b(str)) {
                c(string, list);
            }
        }
    }

    public final void f() {
    }
}

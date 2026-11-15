package p124m3;

import android.app.Activity;
import android.util.Pair;
import android.view.View;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import p044e3.h;

/* JADX INFO: loaded from: classes.dex */
public interface e extends JSExceptionHandler {

    public interface a {
        void onResume();
    }

    boolean A();

    void B();

    void C(ReactContext reactContext);

    void D();

    View a(String str);

    void b(boolean z9);

    h c(String str);

    void d(View view);

    void e();

    void f();

    void g(String str, a aVar);

    ReactContext getCurrentReactContext();

    Activity h();

    void i(boolean z9);

    String j();

    String k();

    void l();

    boolean m();

    void n();

    Pair o(Pair pair);

    void p(boolean z9);

    f q();

    String r();

    i s();

    void t();

    j[] u();

    void v(g gVar);

    void w(ReactContext reactContext);

    void x();

    void y(String str, d dVar);

    E3.a z();
}

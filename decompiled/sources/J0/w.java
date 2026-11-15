package J0;

import android.net.Uri;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class w implements WebMessageListenerBoundaryInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final I0.i.a f1922a;

    public w(I0.i.a aVar) {
        this.f1922a = aVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z9, InvocationHandler invocationHandler2) {
        I0.e eVarB = v.b((WebMessageBoundaryInterface) t9.a.a(WebMessageBoundaryInterface.class, invocationHandler));
        if (eVarB != null) {
            this.f1922a.onPostMessage(webView, eVarB, uri, z9, p.b(invocationHandler2));
        }
    }
}

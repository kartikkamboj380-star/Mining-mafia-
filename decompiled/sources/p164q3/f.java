package p164q3;

import com.facebook.react.views.image.ReactImageManager;
import com.facebook.react.views.modal.ReactModalHostManager;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.react.views.scroll.ReactScrollViewManager;
import com.facebook.react.views.text.ReactRawTextManager;
import com.facebook.react.views.view.ReactViewManager;
import java.util.Map;
import kotlin.collections.E;
import kotlin.jvm.internal.Intrinsics;
import p129m8.q;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f48051a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f48052b = E.j(q.a("View", ReactViewManager.REACT_CLASS), q.a("Image", ReactImageManager.REACT_CLASS), q.a("ScrollView", ReactScrollViewManager.REACT_CLASS), q.a("Slider", "RCTSlider"), q.a("ModalHostView", ReactModalHostManager.REACT_CLASS), q.a("Paragraph", "RCTText"), q.a("Text", "RCTText"), q.a("RawText", ReactRawTextManager.REACT_CLASS), q.a("ActivityIndicatorView", ReactProgressBarViewManager.REACT_CLASS), q.a("ShimmeringView", "RKShimmeringView"), q.a("TemplateView", "RCTTemplateView"), q.a("AxialGradientView", "RCTAxialGradientView"), q.a("Video", "RCTVideo"), q.a("Map", "RCTMap"), q.a("WebView", "RCTWebView"), q.a("Keyframes", "RCTKeyframes"), q.a("ImpressionTrackingView", "RCTImpressionTrackingView"));

    private f() {
    }

    public static final String a(String componentName) {
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        String str = (String) f48052b.get(componentName);
        return str == null ? componentName : str;
    }
}

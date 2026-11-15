package com.unity3d.services.core.webview;

import I0.e;
import I0.i;
import O.AbstractC0845c0;
import O.C0;
import O.J;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import com.unity3d.services.core.configuration.Experiments;
import com.unity3d.services.core.configuration.IExperiments;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.misc.ViewUtilities;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker;
import com.unity3d.services.core.webview.bridge.IWebViewBridge;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import com.unity3d.services.core.webview.bridge.WebViewBridgeInterface;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p129m8.g;
import p129m8.j;
import p129m8.m;
import p129m8.n;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: loaded from: classes3.dex */
@Metadata
public class WebView extends android.webkit.WebView implements IServiceComponent {

    @NotNull
    private final Lazy sdkMetricsSender$delegate;

    @NotNull
    private final WebViewBridgeInterface webViewBridgeInterface;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(@NotNull Context context) {
        this(context, false, null, null, null, 30, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void applySafeAreaInsets() {
        AbstractC0845c0.A0(this, new J() { // from class: com.unity3d.services.core.webview.d
            @Override // O.J
            public final C0 a(View view, C0 c10) {
                return WebView.applySafeAreaInsets$lambda$3(this.f42827a, view, c10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0 applySafeAreaInsets$lambda$3(WebView this$0, View v10, C0 insets) {
        Object objB;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(v10, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        F.b bVarF = insets.f(C0.l.g());
        Intrinsics.checkNotNullExpressionValue(bVarF, "insets.getInsets(WindowI…Compat.Type.systemBars())");
        F.b bVarF2 = insets.f(C0.l.a());
        Intrinsics.checkNotNullExpressionValue(bVarF2, "insets.getInsets(WindowI…pat.Type.displayCutout())");
        try {
            m.a aVar = m.f46450b;
            objB = m.b(Float.valueOf(this$0.getContext().getResources().getDisplayMetrics().density));
        } catch (Throwable th) {
            m.a aVar2 = m.f46450b;
            objB = m.b(n.a(th));
        }
        Float fValueOf = Float.valueOf(1.0f);
        if (m.f(objB)) {
            objB = fValueOf;
        }
        float fFloatValue = ((Number) objB).floatValue();
        int iApplySafeAreaInsets$lambda$3$toPx = applySafeAreaInsets$lambda$3$toPx(Math.max(bVarF.f650a, bVarF2.f650a), fFloatValue);
        int iApplySafeAreaInsets$lambda$3$toPx2 = applySafeAreaInsets$lambda$3$toPx(Math.max(bVarF.f651b, bVarF2.f651b), fFloatValue);
        this$0.evaluateJavascript(StringsKt.j("\n                (function() {\n                    const root = document.documentElement;\n                    root.style.setProperty('--safe-area-inset-left', '" + iApplySafeAreaInsets$lambda$3$toPx + "px');\n                    root.style.setProperty('--safe-area-inset-right', '" + applySafeAreaInsets$lambda$3$toPx(Math.max(bVarF.f652c, bVarF2.f652c), fFloatValue) + "px');\n                    root.style.setProperty('--safe-area-inset-top', '" + iApplySafeAreaInsets$lambda$3$toPx2 + "px');\n                    root.style.setProperty('--safe-area-inset-bottom', '" + applySafeAreaInsets$lambda$3$toPx(Math.max(bVarF.f653d, bVarF2.f653d), fFloatValue) + "px');\n                })();\n            "), null);
        return insets;
    }

    private static final int applySafeAreaInsets$lambda$3$toPx(int i10, float f10) {
        return (int) (i10 / f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void evaluateJavascript$lambda$1(WebView this$0, String script, ValueCallback valueCallback) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(script, "$script");
        super.evaluateJavascript(script, valueCallback);
    }

    private final SDKMetricsSender getSdkMetricsSender() {
        return (SDKMetricsSender) this.sdkMetricsSender$delegate.getValue();
    }

    @Override // android.webkit.WebView
    public void evaluateJavascript(@NotNull final String script, @Nullable final ValueCallback<String> valueCallback) {
        Intrinsics.checkNotNullParameter(script, "script");
        Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.core.webview.c
            @Override // java.lang.Runnable
            public final void run() {
                WebView.evaluateJavascript$lambda$1(this.f42824a, script, valueCallback);
            }
        });
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    @NotNull
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    @Override // android.webkit.WebView
    public void loadUrl(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        DeviceLog.debug("Loading url: " + url);
        super.loadUrl(url);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(@NotNull Context context, boolean z9) {
        this(context, z9, null, null, null, 28, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(@NotNull Context context, boolean z9, @NotNull IWebViewBridge webViewBridge) {
        this(context, z9, webViewBridge, null, null, 24, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(webViewBridge, "webViewBridge");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(@NotNull Context context, boolean z9, @NotNull IWebViewBridge webViewBridge, @NotNull IInvocationCallbackInvoker callbackInvoker) {
        this(context, z9, webViewBridge, callbackInvoker, null, 16, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(webViewBridge, "webViewBridge");
        Intrinsics.checkNotNullParameter(callbackInvoker, "callbackInvoker");
    }

    public /* synthetic */ WebView(Context context, boolean z9, IWebViewBridge iWebViewBridge, IInvocationCallbackInvoker iInvocationCallbackInvoker, IExperiments iExperiments, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? false : z9, (i10 & 4) != 0 ? SharedInstances.INSTANCE.getWebViewBridge() : iWebViewBridge, (i10 & 8) != 0 ? SharedInstances.INSTANCE.getWebViewAppInvocationCallbackInvoker() : iInvocationCallbackInvoker, (i10 & 16) != 0 ? new Experiments() : iExperiments);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebView(@NotNull Context context, boolean z9, @NotNull IWebViewBridge webViewBridge, @NotNull IInvocationCallbackInvoker callbackInvoker, @NotNull IExperiments experiments) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(webViewBridge, "webViewBridge");
        Intrinsics.checkNotNullParameter(callbackInvoker, "callbackInvoker");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.sdkMetricsSender$delegate = g.b(j.NONE, new WebView$special$$inlined$inject$default$1(this, ""));
        final WebViewBridgeInterface webViewBridgeInterface = new WebViewBridgeInterface(webViewBridge, callbackInvoker);
        this.webViewBridgeInterface = webViewBridgeInterface;
        WebSettings settings = getSettings();
        settings.setAllowFileAccessFromFileURLs(true);
        settings.setAllowUniversalAccessFromFileURLs(true);
        settings.setAllowFileAccess(true);
        settings.setBlockNetworkImage(false);
        settings.setBlockNetworkLoads(false);
        settings.setBuiltInZoomControls(false);
        settings.setCacheMode(2);
        settings.setDatabaseEnabled(false);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(false);
        settings.setEnableSmoothTransition(false);
        settings.setGeolocationEnabled(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setJavaScriptEnabled(true);
        settings.setLightTouchEnabled(false);
        settings.setLoadWithOverviewMode(false);
        settings.setLoadsImagesAutomatically(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setMixedContentMode(1);
        settings.setNeedInitialFocus(true);
        settings.setPluginState(WebSettings.PluginState.OFF);
        settings.setRenderPriority(WebSettings.RenderPriority.NORMAL);
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(false);
        settings.setSupportZoom(false);
        settings.setUseWideViewPort(true);
        settings.setMediaPlaybackRequiresUserGesture(!z9);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setInitialScale(0);
        setBackgroundColor(0);
        ViewUtilities.setBackground(this, new ColorDrawable(0));
        setBackgroundResource(0);
        boolean zIsWebMessageEnabled = experiments.isWebMessageEnabled();
        if (zIsWebMessageEnabled) {
            getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerEnabledMetric());
        } else {
            getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerDisabledMetric());
        }
        boolean zA = I0.j.a("WEB_MESSAGE_LISTENER");
        if (zA) {
            getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerSupportedMetric());
        } else {
            getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerUnsupportedMetric());
        }
        if (zIsWebMessageEnabled && zA) {
            i.b(this, "handleInvocation", M.c("*"), new i.a() { // from class: com.unity3d.services.core.webview.a
                @Override // I0.i.a
                public final void onPostMessage(android.webkit.WebView webView, e eVar, Uri uri, boolean z10, I0.a aVar) throws JSONException {
                    webViewBridgeInterface.onHandleInvocation(webView, eVar, uri, z10, aVar);
                }
            });
            i.b(this, "handleCallback", M.c("*"), new i.a() { // from class: com.unity3d.services.core.webview.b
                @Override // I0.i.a
                public final void onPostMessage(android.webkit.WebView webView, e eVar, Uri uri, boolean z10, I0.a aVar) throws JSONException {
                    webViewBridgeInterface.onHandleCallback(webView, eVar, uri, z10, aVar);
                }
            });
        } else {
            addJavascriptInterface(webViewBridgeInterface, "webviewbridge");
        }
        applySafeAreaInsets();
    }
}

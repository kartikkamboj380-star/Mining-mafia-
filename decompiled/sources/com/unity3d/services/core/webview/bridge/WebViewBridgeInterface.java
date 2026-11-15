package com.unity3d.services.core.webview.bridge;

import I0.e;
import android.net.Uri;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.unity3d.ads.core.extensions.JSONArrayExtensionsKt;
import com.unity3d.services.core.log.DeviceLog;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

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
public final class WebViewBridgeInterface {

    @NotNull
    private final IInvocationCallbackInvoker webViewAppInvocationCallbackInvoker;

    @NotNull
    private final IWebViewBridge webViewBridge;

    /* JADX WARN: Multi-variable type inference failed */
    public WebViewBridgeInterface() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @JavascriptInterface
    public final void handleCallback(@NotNull String callbackId, @NotNull String callbackStatus, @NotNull String rawParameters) {
        Intrinsics.checkNotNullParameter(callbackId, "callbackId");
        Intrinsics.checkNotNullParameter(callbackStatus, "callbackStatus");
        Intrinsics.checkNotNullParameter(rawParameters, "rawParameters");
        DeviceLog.debug("handleCallback " + callbackId + ' ' + callbackStatus + ' ' + rawParameters);
        this.webViewBridge.handleCallback(callbackId, callbackStatus, JSONArrayExtensionsKt.toTypedArray(new JSONArray(rawParameters)));
    }

    @JavascriptInterface
    public final void handleInvocation(@NotNull String data) throws JSONException {
        Intrinsics.checkNotNullParameter(data, "data");
        DeviceLog.debug("handleInvocation " + data);
        JSONArray jSONArray = new JSONArray(data);
        Invocation invocation = new Invocation(this.webViewAppInvocationCallbackInvoker, this.webViewBridge);
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = jSONArray.get(i10);
            Intrinsics.d(obj, "null cannot be cast to non-null type org.json.JSONArray");
            JSONArray jSONArray2 = (JSONArray) obj;
            Object obj2 = jSONArray2.get(0);
            Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = jSONArray2.get(1);
            Intrinsics.d(obj3, "null cannot be cast to non-null type kotlin.String");
            Object obj4 = jSONArray2.get(2);
            Intrinsics.d(obj4, "null cannot be cast to non-null type org.json.JSONArray");
            Object obj5 = jSONArray2.get(3);
            Intrinsics.d(obj5, "null cannot be cast to non-null type kotlin.String");
            invocation.addInvocation((String) obj2, (String) obj3, JSONArrayExtensionsKt.toTypedArray((JSONArray) obj4), new WebViewCallback((String) obj5, invocation.getId()));
            invocation.nextInvocation();
        }
        invocation.sendInvocationCallback();
    }

    public final void onHandleCallback(@NotNull WebView view, @NotNull e message, @NotNull Uri sourceOrigin, boolean z9, @NotNull I0.a replyProxy) throws JSONException {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(sourceOrigin, "sourceOrigin");
        Intrinsics.checkNotNullParameter(replyProxy, "replyProxy");
        String strB = message.b();
        if (!z9 || strB == null || StringsKt.b0(strB)) {
            return;
        }
        JSONObject jSONObject = new JSONObject(strB);
        String callbackId = jSONObject.getString("id");
        String callbackStatus = jSONObject.getString("status");
        String rawParameters = jSONObject.getString("parameters");
        Intrinsics.checkNotNullExpressionValue(callbackId, "callbackId");
        Intrinsics.checkNotNullExpressionValue(callbackStatus, "callbackStatus");
        Intrinsics.checkNotNullExpressionValue(rawParameters, "rawParameters");
        handleCallback(callbackId, callbackStatus, rawParameters);
    }

    public final void onHandleInvocation(@NotNull WebView view, @NotNull e message, @NotNull Uri sourceOrigin, boolean z9, @NotNull I0.a replyProxy) throws JSONException {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(sourceOrigin, "sourceOrigin");
        Intrinsics.checkNotNullParameter(replyProxy, "replyProxy");
        String strB = message.b();
        if (!z9 || strB == null || StringsKt.b0(strB)) {
            return;
        }
        handleInvocation(strB);
    }

    public WebViewBridgeInterface(@NotNull IWebViewBridge webViewBridge, @NotNull IInvocationCallbackInvoker webViewAppInvocationCallbackInvoker) {
        Intrinsics.checkNotNullParameter(webViewBridge, "webViewBridge");
        Intrinsics.checkNotNullParameter(webViewAppInvocationCallbackInvoker, "webViewAppInvocationCallbackInvoker");
        this.webViewBridge = webViewBridge;
        this.webViewAppInvocationCallbackInvoker = webViewAppInvocationCallbackInvoker;
    }

    public /* synthetic */ WebViewBridgeInterface(IWebViewBridge iWebViewBridge, IInvocationCallbackInvoker iInvocationCallbackInvoker, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? SharedInstances.INSTANCE.getWebViewBridge() : iWebViewBridge, (i10 & 2) != 0 ? SharedInstances.INSTANCE.getWebViewAppInvocationCallbackInvoker() : iInvocationCallbackInvoker);
    }
}

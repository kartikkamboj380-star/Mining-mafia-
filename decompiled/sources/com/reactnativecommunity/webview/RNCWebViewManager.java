package com.reactnativecommunity.webview;

import X3.C1048n;
import X3.InterfaceC1050o;
import android.view.View;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.E0;
import com.facebook.react.uimanager.U0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.views.scroll.q;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@p234x3.a(name = "RNCWebView")
public class RNCWebViewManager extends ViewGroupManager<o> implements InterfaceC1050o {
    private final U0 mDelegate = new C1048n(this);
    private final j mRNCWebViewManagerImpl = new j(true);

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return this.mRNCWebViewManagerImpl.g();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected U0 getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = p044e3.d.b();
        }
        exportedCustomDirectEventTypeConstants.put("topLoadingStart", p044e3.d.c("registrationName", "onLoadingStart"));
        exportedCustomDirectEventTypeConstants.put("topLoadingFinish", p044e3.d.c("registrationName", "onLoadingFinish"));
        exportedCustomDirectEventTypeConstants.put("topLoadingError", p044e3.d.c("registrationName", "onLoadingError"));
        exportedCustomDirectEventTypeConstants.put("topLoadingSubResourceError", p044e3.d.c("registrationName", "onLoadingSubResourceError"));
        exportedCustomDirectEventTypeConstants.put("topMessage", p044e3.d.c("registrationName", "onMessage"));
        exportedCustomDirectEventTypeConstants.put("topLoadingProgress", p044e3.d.c("registrationName", "onLoadingProgress"));
        exportedCustomDirectEventTypeConstants.put("topShouldStartLoadWithRequest", p044e3.d.c("registrationName", "onShouldStartLoadWithRequest"));
        exportedCustomDirectEventTypeConstants.put(q.d(q.SCROLL), p044e3.d.c("registrationName", "onScroll"));
        exportedCustomDirectEventTypeConstants.put("topHttpError", p044e3.d.c("registrationName", "onHttpError"));
        exportedCustomDirectEventTypeConstants.put("topRenderProcessGone", p044e3.d.c("registrationName", "onRenderProcessGone"));
        exportedCustomDirectEventTypeConstants.put("topCustomMenuSelection", p044e3.d.c("registrationName", "onCustomMenuSelection"));
        exportedCustomDirectEventTypeConstants.put("topOpenWindow", p044e3.d.c("registrationName", "onOpenWindow"));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "RNCWebView";
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.N
    public /* bridge */ /* synthetic */ void removeAllViews(@NotNull View view) {
        super.removeAllViews(view);
    }

    @Override // X3.InterfaceC1050o
    public void setAllowingReadAccessToURL(o oVar, String str) {
    }

    @Override // X3.InterfaceC1050o
    public void setAllowsAirPlayForMediaPlayback(o oVar, boolean z9) {
    }

    @Override // X3.InterfaceC1050o
    public void setAllowsBackForwardNavigationGestures(o oVar, boolean z9) {
    }

    @Override // X3.InterfaceC1050o
    public void setAllowsInlineMediaPlayback(o oVar, boolean z9) {
    }

    @Override // X3.InterfaceC1050o
    public void setAllowsLinkPreview(o oVar, boolean z9) {
    }

    @Override // X3.InterfaceC1050o
    public void setAllowsPictureInPictureMediaPlayback(o oVar, boolean z9) {
    }

    @Override // X3.InterfaceC1050o
    public void setAutoManageStatusBarEnabled(o oVar, boolean z9) {
    }

    @Override // X3.InterfaceC1050o
    public void setAutomaticallyAdjustContentInsets(o oVar, boolean z9) {
    }

    @Override // X3.InterfaceC1050o
    public void setBounces(o oVar, boolean z9) {
    }

    @Override // X3.InterfaceC1050o
    public void setContentInset(o oVar, ReadableMap readableMap) {
    }

    @Override // X3.InterfaceC1050o
    public void setContentInsetAdjustmentBehavior(o oVar, String str) {
    }

    @Override // X3.InterfaceC1050o
    public void setContentMode(o oVar, String str) {
    }

    @Override // X3.InterfaceC1050o
    public void setDataDetectorTypes(o oVar, ReadableArray readableArray) {
    }

    @Override // X3.InterfaceC1050o
    public void setDecelerationRate(o oVar, double d10) {
    }

    @Override // X3.InterfaceC1050o
    public void setDirectionalLockEnabled(o oVar, boolean z9) {
    }

    @Override // X3.InterfaceC1050o
    public void setEnableApplePay(o oVar, boolean z9) {
    }

    @Override // X3.InterfaceC1050o
    public void setFraudulentWebsiteWarningEnabled(o oVar, boolean z9) {
    }

    @Override // X3.InterfaceC1050o
    public void setHasOnFileDownload(o oVar, boolean z9) {
    }

    @Override // X3.InterfaceC1050o
    public void setHideKeyboardAccessoryView(o oVar, boolean z9) {
    }

    @Override // X3.InterfaceC1050o
    public void setIndicatorStyle(o oVar, String str) {
    }

    @Override // X3.InterfaceC1050o
    public void setKeyboardDisplayRequiresUserAction(o oVar, boolean z9) {
    }

    @Override // X3.InterfaceC1050o
    public void setLimitsNavigationsToAppBoundDomains(o oVar, boolean z9) {
    }

    @Override // X3.InterfaceC1050o
    public void setMediaCapturePermissionGrantType(o oVar, String str) {
    }

    @Override // X3.InterfaceC1050o
    public void setPagingEnabled(o oVar, boolean z9) {
    }

    @Override // X3.InterfaceC1050o
    public void setPullToRefreshEnabled(o oVar, boolean z9) {
    }

    @Override // X3.InterfaceC1050o
    public void setRefreshControlLightMode(o oVar, boolean z9) {
    }

    @Override // X3.InterfaceC1050o
    public void setScrollEnabled(o oVar, boolean z9) {
    }

    @Override // X3.InterfaceC1050o
    public void setSharedCookiesEnabled(o oVar, boolean z9) {
    }

    @Override // X3.InterfaceC1050o
    @O3.a(name = "suppressMenuItems")
    public void setSuppressMenuItems(o oVar, ReadableArray readableArray) {
    }

    @Override // X3.InterfaceC1050o
    public void setTextInteractionEnabled(o oVar, boolean z9) {
    }

    @Override // X3.InterfaceC1050o
    public void setUseSharedProcessPool(o oVar, boolean z9) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(@NonNull E0 e10, o oVar) {
        oVar.getWebView().setWebViewClient(new f());
    }

    @Override // X3.InterfaceC1050o
    public void clearCache(o oVar, boolean z9) {
        oVar.getWebView().clearCache(z9);
    }

    @Override // X3.InterfaceC1050o
    public void clearFormData(o oVar) {
        oVar.getWebView().clearFormData();
    }

    @Override // X3.InterfaceC1050o
    public void clearHistory(o oVar) {
        oVar.getWebView().clearHistory();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    @NonNull
    public o createViewInstance(@NonNull E0 e10) {
        return this.mRNCWebViewManagerImpl.d(e10);
    }

    @Override // X3.InterfaceC1050o
    public void goBack(o oVar) {
        oVar.getWebView().goBack();
    }

    @Override // X3.InterfaceC1050o
    public void goForward(o oVar) {
        oVar.getWebView().goForward();
    }

    @Override // X3.InterfaceC1050o
    public void injectJavaScript(o oVar, String str) {
        oVar.getWebView().h(str);
    }

    @Override // X3.InterfaceC1050o
    public void loadUrl(o oVar, String str) {
        oVar.getWebView().loadUrl(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NonNull o oVar) {
        super.onAfterUpdateTransaction(oVar);
        this.mRNCWebViewManagerImpl.l(oVar);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@NonNull o oVar) {
        this.mRNCWebViewManagerImpl.m(oVar);
        super.onDropViewInstance(oVar);
    }

    @Override // X3.InterfaceC1050o
    public void postMessage(o oVar, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JsonStorageKeyNames.DATA_KEY, str);
            oVar.getWebView().h("(function () {var event;var data = " + jSONObject.toString() + ";try {event = new MessageEvent('message', data);} catch (e) {event = document.createEvent('MessageEvent');event.initMessageEvent('message', true, true, data.data, data.origin, data.lastEventId, data.source);}document.dispatchEvent(event);})();");
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(@NonNull o oVar, String str, ReadableArray readableArray) {
        super.receiveCommand(oVar, str, readableArray);
    }

    @Override // X3.InterfaceC1050o
    public void reload(o oVar) {
        oVar.getWebView().reload();
    }

    @Override // X3.InterfaceC1050o
    public void requestFocus(o oVar) {
        oVar.requestFocus();
    }

    @Override // X3.InterfaceC1050o
    @O3.a(name = "allowFileAccess")
    public void setAllowFileAccess(o oVar, boolean z9) {
        this.mRNCWebViewManagerImpl.n(oVar, z9);
    }

    @Override // X3.InterfaceC1050o
    @O3.a(name = "allowFileAccessFromFileURLs")
    public void setAllowFileAccessFromFileURLs(o oVar, boolean z9) {
        this.mRNCWebViewManagerImpl.o(oVar, z9);
    }

    @Override // X3.InterfaceC1050o
    @O3.a(name = "allowUniversalAccessFromFileURLs")
    public void setAllowUniversalAccessFromFileURLs(o oVar, boolean z9) {
        this.mRNCWebViewManagerImpl.p(oVar, z9);
    }

    @Override // X3.InterfaceC1050o
    @O3.a(name = "allowsFullscreenVideo")
    public void setAllowsFullscreenVideo(o oVar, boolean z9) {
        this.mRNCWebViewManagerImpl.q(oVar, z9);
    }

    @Override // X3.InterfaceC1050o
    @O3.a(name = "allowsProtectedMedia")
    public void setAllowsProtectedMedia(o oVar, boolean z9) {
        this.mRNCWebViewManagerImpl.r(oVar, z9);
    }

    @Override // X3.InterfaceC1050o
    @O3.a(name = "androidLayerType")
    public void setAndroidLayerType(o oVar, String str) {
        this.mRNCWebViewManagerImpl.s(oVar, str);
    }

    @Override // X3.InterfaceC1050o
    @O3.a(name = "applicationNameForUserAgent")
    public void setApplicationNameForUserAgent(o oVar, String str) {
        this.mRNCWebViewManagerImpl.t(oVar, str);
    }

    @Override // X3.InterfaceC1050o
    @O3.a(name = "basicAuthCredential")
    public void setBasicAuthCredential(o oVar, ReadableMap readableMap) {
        this.mRNCWebViewManagerImpl.u(oVar, readableMap);
    }

    @Override // X3.InterfaceC1050o
    @O3.a(name = "cacheEnabled")
    public void setCacheEnabled(o oVar, boolean z9) {
        this.mRNCWebViewManagerImpl.v(oVar, z9);
    }

    @Override // X3.InterfaceC1050o
    @O3.a(name = "cacheMode")
    public void setCacheMode(o oVar, String str) {
        this.mRNCWebViewManagerImpl.w(oVar, str);
    }

    @Override // X3.InterfaceC1050o
    @O3.a(name = "domStorageEnabled")
    public void setDomStorageEnabled(o oVar, boolean z9) {
        this.mRNCWebViewManagerImpl.x(oVar, z9);
    }

    @Override // X3.InterfaceC1050o
    @O3.a(name = "downloadingMessage")
    public void setDownloadingMessage(o oVar, String str) {
        this.mRNCWebViewManagerImpl.y(str);
    }

    @Override // X3.InterfaceC1050o
    @O3.a(name = "forceDarkOn")
    public void setForceDarkOn(o oVar, boolean z9) {
        this.mRNCWebViewManagerImpl.z(oVar, z9);
    }

    @Override // X3.InterfaceC1050o
    @O3.a(name = "geolocationEnabled")
    public void setGeolocationEnabled(o oVar, boolean z9) {
        this.mRNCWebViewManagerImpl.A(oVar, z9);
    }

    @Override // X3.InterfaceC1050o
    @O3.a(name = "hasOnOpenWindowEvent")
    public void setHasOnOpenWindowEvent(o oVar, boolean z9) {
        this.mRNCWebViewManagerImpl.B(oVar, z9);
    }

    @Override // X3.InterfaceC1050o
    @O3.a(name = "hasOnScroll")
    public void setHasOnScroll(o oVar, boolean z9) {
        this.mRNCWebViewManagerImpl.C(oVar, z9);
    }

    @Override // X3.InterfaceC1050o
    @O3.a(name = "incognito")
    public void setIncognito(o oVar, boolean z9) {
        this.mRNCWebViewManagerImpl.D(oVar, z9);
    }

    @Override // X3.InterfaceC1050o
    @O3.a(name = "injectedJavaScript")
    public void setInjectedJavaScript(o oVar, String str) {
        this.mRNCWebViewManagerImpl.E(oVar, str);
    }

    @Override // X3.InterfaceC1050o
    @O3.a(name = "injectedJavaScriptBeforeContentLoaded")
    public void setInjectedJavaScriptBeforeContentLoaded(o oVar, String str) {
        this.mRNCWebViewManagerImpl.F(oVar, str);
    }

    @Override // X3.InterfaceC1050o
    @O3.a(name = "injectedJavaScriptBeforeContentLoadedForMainFrameOnly")
    public void setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(o oVar, boolean z9) {
        this.mRNCWebViewManagerImpl.G(oVar, z9);
    }

    @Override // X3.InterfaceC1050o
    @O3.a(name = "injectedJavaScriptForMainFrameOnly")
    public void setInjectedJavaScriptForMainFrameOnly(o oVar, boolean z9) {
        this.mRNCWebViewManagerImpl.H(oVar, z9);
    }

    @Override // X3.InterfaceC1050o
    @O3.a(name = "injectedJavaScriptObject")
    public void setInjectedJavaScriptObject(o oVar, String str) {
        this.mRNCWebViewManagerImpl.I(oVar, str);
    }

    @Override // X3.InterfaceC1050o
    @O3.a(name = "javaScriptCanOpenWindowsAutomatically")
    public void setJavaScriptCanOpenWindowsAutomatically(o oVar, boolean z9) {
        this.mRNCWebViewManagerImpl.J(oVar, z9);
    }

    @Override // X3.InterfaceC1050o
    @O3.a(name = "javaScriptEnabled")
    public void setJavaScriptEnabled(o oVar, boolean z9) {
        this.mRNCWebViewManagerImpl.K(oVar, z9);
    }

    @Override // X3.InterfaceC1050o
    @O3.a(name = "lackPermissionToDownloadMessage")
    public void setLackPermissionToDownloadMessage(o oVar, String str) {
        this.mRNCWebViewManagerImpl.L(str);
    }

    @Override // X3.InterfaceC1050o
    @O3.a(name = "mediaPlaybackRequiresUserAction")
    public void setMediaPlaybackRequiresUserAction(o oVar, boolean z9) {
        this.mRNCWebViewManagerImpl.M(oVar, z9);
    }

    @Override // X3.InterfaceC1050o
    @O3.a(name = "menuItems")
    public void setMenuItems(o oVar, ReadableArray readableArray) {
        this.mRNCWebViewManagerImpl.N(oVar, readableArray);
    }

    @Override // X3.InterfaceC1050o
    @O3.a(name = "messagingEnabled")
    public void setMessagingEnabled(o oVar, boolean z9) {
        this.mRNCWebViewManagerImpl.O(oVar, z9);
    }

    @Override // X3.InterfaceC1050o
    @O3.a(name = "messagingModuleName")
    public void setMessagingModuleName(o oVar, String str) {
        this.mRNCWebViewManagerImpl.P(oVar, str);
    }

    @Override // X3.InterfaceC1050o
    @O3.a(name = "minimumFontSize")
    public void setMinimumFontSize(o oVar, int i10) {
        this.mRNCWebViewManagerImpl.Q(oVar, i10);
    }

    @Override // X3.InterfaceC1050o
    @O3.a(name = "mixedContentMode")
    public void setMixedContentMode(o oVar, String str) {
        this.mRNCWebViewManagerImpl.R(oVar, str);
    }

    @Override // X3.InterfaceC1050o
    @O3.a(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(o oVar, boolean z9) {
        this.mRNCWebViewManagerImpl.S(oVar, z9);
    }

    @Override // X3.InterfaceC1050o
    @O3.a(name = "newSource")
    public void setNewSource(o oVar, ReadableMap readableMap) {
        this.mRNCWebViewManagerImpl.c0(oVar, readableMap);
    }

    @Override // X3.InterfaceC1050o
    @O3.a(name = "overScrollMode")
    public void setOverScrollMode(o oVar, String str) {
        this.mRNCWebViewManagerImpl.T(oVar, str);
    }

    @Override // X3.InterfaceC1050o
    @O3.a(name = "paymentRequestEnabled")
    public void setPaymentRequestEnabled(o oVar, boolean z9) {
        this.mRNCWebViewManagerImpl.U(oVar, z9);
    }

    @Override // X3.InterfaceC1050o
    @O3.a(name = "saveFormDataDisabled")
    public void setSaveFormDataDisabled(o oVar, boolean z9) {
        this.mRNCWebViewManagerImpl.V(oVar, z9);
    }

    @Override // X3.InterfaceC1050o
    @O3.a(name = "scalesPageToFit")
    public void setScalesPageToFit(o oVar, boolean z9) {
        this.mRNCWebViewManagerImpl.W(oVar, z9);
    }

    @Override // X3.InterfaceC1050o
    @O3.a(name = "setBuiltInZoomControls")
    public void setSetBuiltInZoomControls(o oVar, boolean z9) {
        this.mRNCWebViewManagerImpl.X(oVar, z9);
    }

    @Override // X3.InterfaceC1050o
    @O3.a(name = "setDisplayZoomControls")
    public void setSetDisplayZoomControls(o oVar, boolean z9) {
        this.mRNCWebViewManagerImpl.Y(oVar, z9);
    }

    @Override // X3.InterfaceC1050o
    @O3.a(name = "setSupportMultipleWindows")
    public void setSetSupportMultipleWindows(o oVar, boolean z9) {
        this.mRNCWebViewManagerImpl.Z(oVar, z9);
    }

    @Override // X3.InterfaceC1050o
    @O3.a(name = "showsHorizontalScrollIndicator")
    public void setShowsHorizontalScrollIndicator(o oVar, boolean z9) {
        this.mRNCWebViewManagerImpl.a0(oVar, z9);
    }

    @Override // X3.InterfaceC1050o
    @O3.a(name = "showsVerticalScrollIndicator")
    public void setShowsVerticalScrollIndicator(o oVar, boolean z9) {
        this.mRNCWebViewManagerImpl.b0(oVar, z9);
    }

    @Override // X3.InterfaceC1050o
    @O3.a(name = "textZoom")
    public void setTextZoom(o oVar, int i10) {
        this.mRNCWebViewManagerImpl.d0(oVar, i10);
    }

    @Override // X3.InterfaceC1050o
    @O3.a(name = "thirdPartyCookiesEnabled")
    public void setThirdPartyCookiesEnabled(o oVar, boolean z9) {
        this.mRNCWebViewManagerImpl.e0(oVar, z9);
    }

    @Override // X3.InterfaceC1050o
    @O3.a(name = "userAgent")
    public void setUserAgent(o oVar, String str) {
        this.mRNCWebViewManagerImpl.f0(oVar, str);
    }

    @Override // X3.InterfaceC1050o
    @O3.a(name = "webviewDebuggingEnabled")
    public void setWebviewDebuggingEnabled(o oVar, boolean z9) {
        this.mRNCWebViewManagerImpl.h0(oVar, z9);
    }

    @Override // X3.InterfaceC1050o
    public void stopLoading(o oVar) {
        oVar.getWebView().stopLoading();
    }
}

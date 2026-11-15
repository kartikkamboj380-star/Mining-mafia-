package X3;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.e1;

/* JADX INFO: renamed from: X3.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1050o extends e1 {
    void clearCache(View view, boolean z9);

    void clearFormData(View view);

    void clearHistory(View view);

    void goBack(View view);

    void goForward(View view);

    void injectJavaScript(View view, String str);

    void loadUrl(View view, String str);

    void postMessage(View view, String str);

    void reload(View view);

    void requestFocus(View view);

    void setAllowFileAccess(View view, boolean z9);

    void setAllowFileAccessFromFileURLs(View view, boolean z9);

    void setAllowUniversalAccessFromFileURLs(View view, boolean z9);

    void setAllowingReadAccessToURL(View view, String str);

    void setAllowsAirPlayForMediaPlayback(View view, boolean z9);

    void setAllowsBackForwardNavigationGestures(View view, boolean z9);

    void setAllowsFullscreenVideo(View view, boolean z9);

    void setAllowsInlineMediaPlayback(View view, boolean z9);

    void setAllowsLinkPreview(View view, boolean z9);

    void setAllowsPictureInPictureMediaPlayback(View view, boolean z9);

    void setAllowsProtectedMedia(View view, boolean z9);

    void setAndroidLayerType(View view, String str);

    void setApplicationNameForUserAgent(View view, String str);

    void setAutoManageStatusBarEnabled(View view, boolean z9);

    void setAutomaticallyAdjustContentInsets(View view, boolean z9);

    void setBasicAuthCredential(View view, ReadableMap readableMap);

    void setBounces(View view, boolean z9);

    void setCacheEnabled(View view, boolean z9);

    void setCacheMode(View view, String str);

    void setContentInset(View view, ReadableMap readableMap);

    void setContentInsetAdjustmentBehavior(View view, String str);

    void setContentMode(View view, String str);

    void setDataDetectorTypes(View view, ReadableArray readableArray);

    void setDecelerationRate(View view, double d10);

    void setDirectionalLockEnabled(View view, boolean z9);

    void setDomStorageEnabled(View view, boolean z9);

    void setDownloadingMessage(View view, String str);

    void setEnableApplePay(View view, boolean z9);

    void setForceDarkOn(View view, boolean z9);

    void setFraudulentWebsiteWarningEnabled(View view, boolean z9);

    void setGeolocationEnabled(View view, boolean z9);

    void setHasOnFileDownload(View view, boolean z9);

    void setHasOnOpenWindowEvent(View view, boolean z9);

    void setHasOnScroll(View view, boolean z9);

    void setHideKeyboardAccessoryView(View view, boolean z9);

    void setIncognito(View view, boolean z9);

    void setIndicatorStyle(View view, String str);

    void setInjectedJavaScript(View view, String str);

    void setInjectedJavaScriptBeforeContentLoaded(View view, String str);

    void setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(View view, boolean z9);

    void setInjectedJavaScriptForMainFrameOnly(View view, boolean z9);

    void setInjectedJavaScriptObject(View view, String str);

    void setJavaScriptCanOpenWindowsAutomatically(View view, boolean z9);

    void setJavaScriptEnabled(View view, boolean z9);

    void setKeyboardDisplayRequiresUserAction(View view, boolean z9);

    void setLackPermissionToDownloadMessage(View view, String str);

    void setLimitsNavigationsToAppBoundDomains(View view, boolean z9);

    void setMediaCapturePermissionGrantType(View view, String str);

    void setMediaPlaybackRequiresUserAction(View view, boolean z9);

    void setMenuItems(View view, ReadableArray readableArray);

    void setMessagingEnabled(View view, boolean z9);

    void setMessagingModuleName(View view, String str);

    void setMinimumFontSize(View view, int i10);

    void setMixedContentMode(View view, String str);

    void setNestedScrollEnabled(View view, boolean z9);

    void setNewSource(View view, ReadableMap readableMap);

    void setOverScrollMode(View view, String str);

    void setPagingEnabled(View view, boolean z9);

    void setPaymentRequestEnabled(View view, boolean z9);

    void setPullToRefreshEnabled(View view, boolean z9);

    void setRefreshControlLightMode(View view, boolean z9);

    void setSaveFormDataDisabled(View view, boolean z9);

    void setScalesPageToFit(View view, boolean z9);

    void setScrollEnabled(View view, boolean z9);

    void setSetBuiltInZoomControls(View view, boolean z9);

    void setSetDisplayZoomControls(View view, boolean z9);

    void setSetSupportMultipleWindows(View view, boolean z9);

    void setSharedCookiesEnabled(View view, boolean z9);

    void setShowsHorizontalScrollIndicator(View view, boolean z9);

    void setShowsVerticalScrollIndicator(View view, boolean z9);

    void setSuppressMenuItems(View view, ReadableArray readableArray);

    void setTextInteractionEnabled(View view, boolean z9);

    void setTextZoom(View view, int i10);

    void setThirdPartyCookiesEnabled(View view, boolean z9);

    void setUseSharedProcessPool(View view, boolean z9);

    void setUserAgent(View view, String str);

    void setWebviewDebuggingEnabled(View view, boolean z9);

    void stopLoading(View view);
}

package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC6334u0 extends IInterface {
    void beginAdUnitExposure(String str, long j10);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j10);

    void endAdUnitExposure(String str, long j10);

    void generateEventId(InterfaceC6361x0 interfaceC6361x0);

    void getAppInstanceId(InterfaceC6361x0 interfaceC6361x0);

    void getCachedAppInstanceId(InterfaceC6361x0 interfaceC6361x0);

    void getConditionalUserProperties(String str, String str2, InterfaceC6361x0 interfaceC6361x0);

    void getCurrentScreenClass(InterfaceC6361x0 interfaceC6361x0);

    void getCurrentScreenName(InterfaceC6361x0 interfaceC6361x0);

    void getGmpAppId(InterfaceC6361x0 interfaceC6361x0);

    void getMaxUserProperties(String str, InterfaceC6361x0 interfaceC6361x0);

    void getSessionId(InterfaceC6361x0 interfaceC6361x0);

    void getTestFlag(InterfaceC6361x0 interfaceC6361x0, int i10);

    void getUserProperties(String str, String str2, boolean z9, InterfaceC6361x0 interfaceC6361x0);

    void initForTests(Map map);

    void initialize(com.google.android.gms.dynamic.a aVar, H0 h10, long j10);

    void isDataCollectionEnabled(InterfaceC6361x0 interfaceC6361x0);

    void logEvent(String str, String str2, Bundle bundle, boolean z9, boolean z10, long j10);

    void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC6361x0 interfaceC6361x0, long j10);

    void logHealthData(int i10, String str, com.google.android.gms.dynamic.a aVar, com.google.android.gms.dynamic.a aVar2, com.google.android.gms.dynamic.a aVar3);

    void onActivityCreated(com.google.android.gms.dynamic.a aVar, Bundle bundle, long j10);

    void onActivityCreatedByScionActivityInfo(J0 j10, Bundle bundle, long j11);

    void onActivityDestroyed(com.google.android.gms.dynamic.a aVar, long j10);

    void onActivityDestroyedByScionActivityInfo(J0 j10, long j11);

    void onActivityPaused(com.google.android.gms.dynamic.a aVar, long j10);

    void onActivityPausedByScionActivityInfo(J0 j10, long j11);

    void onActivityResumed(com.google.android.gms.dynamic.a aVar, long j10);

    void onActivityResumedByScionActivityInfo(J0 j10, long j11);

    void onActivitySaveInstanceState(com.google.android.gms.dynamic.a aVar, InterfaceC6361x0 interfaceC6361x0, long j10);

    void onActivitySaveInstanceStateByScionActivityInfo(J0 j10, InterfaceC6361x0 interfaceC6361x0, long j11);

    void onActivityStarted(com.google.android.gms.dynamic.a aVar, long j10);

    void onActivityStartedByScionActivityInfo(J0 j10, long j11);

    void onActivityStopped(com.google.android.gms.dynamic.a aVar, long j10);

    void onActivityStoppedByScionActivityInfo(J0 j10, long j11);

    void performAction(Bundle bundle, InterfaceC6361x0 interfaceC6361x0, long j10);

    void registerOnMeasurementEventListener(E0 e10);

    void resetAnalyticsData(long j10);

    void retrieveAndUploadBatches(A0 a10);

    void setConditionalUserProperty(Bundle bundle, long j10);

    void setConsent(Bundle bundle, long j10);

    void setConsentThirdParty(Bundle bundle, long j10);

    void setCurrentScreen(com.google.android.gms.dynamic.a aVar, String str, String str2, long j10);

    void setCurrentScreenByScionActivityInfo(J0 j10, String str, String str2, long j11);

    void setDataCollectionEnabled(boolean z9);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(E0 e10);

    void setInstanceIdProvider(G0 g10);

    void setMeasurementEnabled(boolean z9, long j10);

    void setMinimumSessionDuration(long j10);

    void setSessionTimeoutDuration(long j10);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j10);

    void setUserProperty(String str, String str2, com.google.android.gms.dynamic.a aVar, boolean z9, long j10);

    void unregisterOnMeasurementEventListener(E0 e10);
}

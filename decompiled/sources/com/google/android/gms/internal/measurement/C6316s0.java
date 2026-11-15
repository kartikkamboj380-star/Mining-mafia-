package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6316s0 extends N implements InterfaceC6334u0 {
    C6316s0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6334u0
    public final void beginAdUnitExposure(String str, long j10) {
        Parcel parcelH0 = h0();
        parcelH0.writeString(str);
        parcelH0.writeLong(j10);
        N0(23, parcelH0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6334u0
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelH0 = h0();
        parcelH0.writeString(str);
        parcelH0.writeString(str2);
        P.c(parcelH0, bundle);
        N0(9, parcelH0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6334u0
    public final void endAdUnitExposure(String str, long j10) {
        Parcel parcelH0 = h0();
        parcelH0.writeString(str);
        parcelH0.writeLong(j10);
        N0(24, parcelH0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6334u0
    public final void generateEventId(InterfaceC6361x0 interfaceC6361x0) {
        Parcel parcelH0 = h0();
        P.d(parcelH0, interfaceC6361x0);
        N0(22, parcelH0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6334u0
    public final void getAppInstanceId(InterfaceC6361x0 interfaceC6361x0) {
        Parcel parcelH0 = h0();
        P.d(parcelH0, interfaceC6361x0);
        N0(20, parcelH0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6334u0
    public final void getCachedAppInstanceId(InterfaceC6361x0 interfaceC6361x0) {
        Parcel parcelH0 = h0();
        P.d(parcelH0, interfaceC6361x0);
        N0(19, parcelH0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6334u0
    public final void getConditionalUserProperties(String str, String str2, InterfaceC6361x0 interfaceC6361x0) {
        Parcel parcelH0 = h0();
        parcelH0.writeString(str);
        parcelH0.writeString(str2);
        P.d(parcelH0, interfaceC6361x0);
        N0(10, parcelH0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6334u0
    public final void getCurrentScreenClass(InterfaceC6361x0 interfaceC6361x0) {
        Parcel parcelH0 = h0();
        P.d(parcelH0, interfaceC6361x0);
        N0(17, parcelH0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6334u0
    public final void getCurrentScreenName(InterfaceC6361x0 interfaceC6361x0) {
        Parcel parcelH0 = h0();
        P.d(parcelH0, interfaceC6361x0);
        N0(16, parcelH0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6334u0
    public final void getGmpAppId(InterfaceC6361x0 interfaceC6361x0) {
        Parcel parcelH0 = h0();
        P.d(parcelH0, interfaceC6361x0);
        N0(21, parcelH0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6334u0
    public final void getMaxUserProperties(String str, InterfaceC6361x0 interfaceC6361x0) {
        Parcel parcelH0 = h0();
        parcelH0.writeString(str);
        P.d(parcelH0, interfaceC6361x0);
        N0(6, parcelH0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6334u0
    public final void getSessionId(InterfaceC6361x0 interfaceC6361x0) {
        Parcel parcelH0 = h0();
        P.d(parcelH0, interfaceC6361x0);
        N0(46, parcelH0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6334u0
    public final void getUserProperties(String str, String str2, boolean z9, InterfaceC6361x0 interfaceC6361x0) {
        Parcel parcelH0 = h0();
        parcelH0.writeString(str);
        parcelH0.writeString(str2);
        int i10 = P.f36442b;
        parcelH0.writeInt(z9 ? 1 : 0);
        P.d(parcelH0, interfaceC6361x0);
        N0(5, parcelH0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6334u0
    public final void initialize(com.google.android.gms.dynamic.a aVar, H0 h10, long j10) {
        Parcel parcelH0 = h0();
        P.d(parcelH0, aVar);
        P.c(parcelH0, h10);
        parcelH0.writeLong(j10);
        N0(1, parcelH0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6334u0
    public final void logEvent(String str, String str2, Bundle bundle, boolean z9, boolean z10, long j10) {
        Parcel parcelH0 = h0();
        parcelH0.writeString(str);
        parcelH0.writeString(str2);
        P.c(parcelH0, bundle);
        parcelH0.writeInt(z9 ? 1 : 0);
        parcelH0.writeInt(z10 ? 1 : 0);
        parcelH0.writeLong(j10);
        N0(2, parcelH0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6334u0
    public final void logHealthData(int i10, String str, com.google.android.gms.dynamic.a aVar, com.google.android.gms.dynamic.a aVar2, com.google.android.gms.dynamic.a aVar3) {
        Parcel parcelH0 = h0();
        parcelH0.writeInt(5);
        parcelH0.writeString(str);
        P.d(parcelH0, aVar);
        P.d(parcelH0, aVar2);
        P.d(parcelH0, aVar3);
        N0(33, parcelH0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6334u0
    public final void onActivityCreatedByScionActivityInfo(J0 j10, Bundle bundle, long j11) {
        Parcel parcelH0 = h0();
        P.c(parcelH0, j10);
        P.c(parcelH0, bundle);
        parcelH0.writeLong(j11);
        N0(53, parcelH0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6334u0
    public final void onActivityDestroyedByScionActivityInfo(J0 j10, long j11) {
        Parcel parcelH0 = h0();
        P.c(parcelH0, j10);
        parcelH0.writeLong(j11);
        N0(54, parcelH0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6334u0
    public final void onActivityPausedByScionActivityInfo(J0 j10, long j11) {
        Parcel parcelH0 = h0();
        P.c(parcelH0, j10);
        parcelH0.writeLong(j11);
        N0(55, parcelH0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6334u0
    public final void onActivityResumedByScionActivityInfo(J0 j10, long j11) {
        Parcel parcelH0 = h0();
        P.c(parcelH0, j10);
        parcelH0.writeLong(j11);
        N0(56, parcelH0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6334u0
    public final void onActivitySaveInstanceStateByScionActivityInfo(J0 j10, InterfaceC6361x0 interfaceC6361x0, long j11) {
        Parcel parcelH0 = h0();
        P.c(parcelH0, j10);
        P.d(parcelH0, interfaceC6361x0);
        parcelH0.writeLong(j11);
        N0(57, parcelH0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6334u0
    public final void onActivityStartedByScionActivityInfo(J0 j10, long j11) {
        Parcel parcelH0 = h0();
        P.c(parcelH0, j10);
        parcelH0.writeLong(j11);
        N0(51, parcelH0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6334u0
    public final void onActivityStoppedByScionActivityInfo(J0 j10, long j11) {
        Parcel parcelH0 = h0();
        P.c(parcelH0, j10);
        parcelH0.writeLong(j11);
        N0(52, parcelH0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6334u0
    public final void registerOnMeasurementEventListener(E0 e10) {
        Parcel parcelH0 = h0();
        P.d(parcelH0, e10);
        N0(35, parcelH0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6334u0
    public final void resetAnalyticsData(long j10) {
        Parcel parcelH0 = h0();
        parcelH0.writeLong(j10);
        N0(12, parcelH0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6334u0
    public final void retrieveAndUploadBatches(A0 a10) {
        Parcel parcelH0 = h0();
        P.d(parcelH0, a10);
        N0(58, parcelH0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6334u0
    public final void setConditionalUserProperty(Bundle bundle, long j10) {
        Parcel parcelH0 = h0();
        P.c(parcelH0, bundle);
        parcelH0.writeLong(j10);
        N0(8, parcelH0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6334u0
    public final void setConsentThirdParty(Bundle bundle, long j10) {
        Parcel parcelH0 = h0();
        P.c(parcelH0, bundle);
        parcelH0.writeLong(j10);
        N0(45, parcelH0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6334u0
    public final void setCurrentScreenByScionActivityInfo(J0 j10, String str, String str2, long j11) {
        Parcel parcelH0 = h0();
        P.c(parcelH0, j10);
        parcelH0.writeString(str);
        parcelH0.writeString(str2);
        parcelH0.writeLong(j11);
        N0(50, parcelH0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6334u0
    public final void setDataCollectionEnabled(boolean z9) {
        Parcel parcelH0 = h0();
        int i10 = P.f36442b;
        parcelH0.writeInt(z9 ? 1 : 0);
        N0(39, parcelH0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6334u0
    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel parcelH0 = h0();
        P.c(parcelH0, bundle);
        N0(42, parcelH0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6334u0
    public final void setMeasurementEnabled(boolean z9, long j10) {
        Parcel parcelH0 = h0();
        int i10 = P.f36442b;
        parcelH0.writeInt(z9 ? 1 : 0);
        parcelH0.writeLong(j10);
        N0(11, parcelH0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6334u0
    public final void setSessionTimeoutDuration(long j10) {
        Parcel parcelH0 = h0();
        parcelH0.writeLong(j10);
        N0(14, parcelH0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6334u0
    public final void setUserId(String str, long j10) {
        Parcel parcelH0 = h0();
        parcelH0.writeString(str);
        parcelH0.writeLong(j10);
        N0(7, parcelH0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6334u0
    public final void setUserProperty(String str, String str2, com.google.android.gms.dynamic.a aVar, boolean z9, long j10) {
        Parcel parcelH0 = h0();
        parcelH0.writeString(str);
        parcelH0.writeString(str2);
        P.d(parcelH0, aVar);
        parcelH0.writeInt(z9 ? 1 : 0);
        parcelH0.writeLong(j10);
        N0(4, parcelH0);
    }
}

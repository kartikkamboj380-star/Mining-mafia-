package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.common.ConnectionResult;
import com.google.protobuf.DescriptorProtos;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC6325t0 extends O implements InterfaceC6334u0 {
    public AbstractBinderC6325t0() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static InterfaceC6334u0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC6334u0 ? (InterfaceC6334u0) iInterfaceQueryLocalInterface : new C6316s0(iBinder);
    }

    @Override // com.google.android.gms.internal.measurement.O
    protected final boolean J(int i10, Parcel parcel, Parcel parcel2, int i11) {
        InterfaceC6361x0 c6343v0 = null;
        A0 c6369y0 = null;
        InterfaceC6361x0 c6343v1 = null;
        InterfaceC6361x0 c6343v2 = null;
        InterfaceC6361x0 c6343v3 = null;
        InterfaceC6361x0 c6343v4 = null;
        E0 b10 = null;
        E0 b11 = null;
        E0 b12 = null;
        InterfaceC6361x0 c6343v5 = null;
        InterfaceC6361x0 c6343v6 = null;
        InterfaceC6361x0 c6343v7 = null;
        InterfaceC6361x0 c6343v8 = null;
        InterfaceC6361x0 c6343v9 = null;
        InterfaceC6361x0 c6343v10 = null;
        G0 f10 = null;
        InterfaceC6361x0 c6343v11 = null;
        InterfaceC6361x0 c6343v12 = null;
        InterfaceC6361x0 c6343v13 = null;
        InterfaceC6361x0 c6343v14 = null;
        InterfaceC6361x0 c6343v15 = null;
        switch (i10) {
            case 1:
                com.google.android.gms.dynamic.a aVarJ = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                H0 h10 = (H0) P.b(parcel, H0.CREATOR);
                long j10 = parcel.readLong();
                P.f(parcel);
                initialize(aVarJ, h10, j10);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) P.b(parcel, Bundle.CREATOR);
                boolean zA = P.a(parcel);
                boolean zA2 = P.a(parcel);
                long j11 = parcel.readLong();
                P.f(parcel);
                logEvent(string, string2, bundle, zA, zA2, j11);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) P.b(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c6343v0 = iInterfaceQueryLocalInterface instanceof InterfaceC6361x0 ? (InterfaceC6361x0) iInterfaceQueryLocalInterface : new C6343v0(strongBinder);
                }
                long j12 = parcel.readLong();
                P.f(parcel);
                logEventAndBundle(string3, string4, bundle2, c6343v0, j12);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                com.google.android.gms.dynamic.a aVarJ2 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                boolean zA3 = P.a(parcel);
                long j13 = parcel.readLong();
                P.f(parcel);
                setUserProperty(string5, string6, aVarJ2, zA3, j13);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean zA4 = P.a(parcel);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c6343v15 = iInterfaceQueryLocalInterface2 instanceof InterfaceC6361x0 ? (InterfaceC6361x0) iInterfaceQueryLocalInterface2 : new C6343v0(strongBinder2);
                }
                P.f(parcel);
                getUserProperties(string7, string8, zA4, c6343v15);
                break;
            case 6:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c6343v14 = iInterfaceQueryLocalInterface3 instanceof InterfaceC6361x0 ? (InterfaceC6361x0) iInterfaceQueryLocalInterface3 : new C6343v0(strongBinder3);
                }
                P.f(parcel);
                getMaxUserProperties(string9, c6343v14);
                break;
            case 7:
                String string10 = parcel.readString();
                long j14 = parcel.readLong();
                P.f(parcel);
                setUserId(string10, j14);
                break;
            case 8:
                Bundle bundle3 = (Bundle) P.b(parcel, Bundle.CREATOR);
                long j15 = parcel.readLong();
                P.f(parcel);
                setConditionalUserProperty(bundle3, j15);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) P.b(parcel, Bundle.CREATOR);
                P.f(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c6343v13 = iInterfaceQueryLocalInterface4 instanceof InterfaceC6361x0 ? (InterfaceC6361x0) iInterfaceQueryLocalInterface4 : new C6343v0(strongBinder4);
                }
                P.f(parcel);
                getConditionalUserProperties(string13, string14, c6343v13);
                break;
            case 11:
                boolean zA5 = P.a(parcel);
                long j16 = parcel.readLong();
                P.f(parcel);
                setMeasurementEnabled(zA5, j16);
                break;
            case 12:
                long j17 = parcel.readLong();
                P.f(parcel);
                resetAnalyticsData(j17);
                break;
            case 13:
                long j18 = parcel.readLong();
                P.f(parcel);
                setMinimumSessionDuration(j18);
                break;
            case 14:
                long j19 = parcel.readLong();
                P.f(parcel);
                setSessionTimeoutDuration(j19);
                break;
            case 15:
                com.google.android.gms.dynamic.a aVarJ3 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j20 = parcel.readLong();
                P.f(parcel);
                setCurrentScreen(aVarJ3, string15, string16, j20);
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c6343v12 = iInterfaceQueryLocalInterface5 instanceof InterfaceC6361x0 ? (InterfaceC6361x0) iInterfaceQueryLocalInterface5 : new C6343v0(strongBinder5);
                }
                P.f(parcel);
                getCurrentScreenName(c6343v12);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c6343v11 = iInterfaceQueryLocalInterface6 instanceof InterfaceC6361x0 ? (InterfaceC6361x0) iInterfaceQueryLocalInterface6 : new C6343v0(strongBinder6);
                }
                P.f(parcel);
                getCurrentScreenClass(c6343v11);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    f10 = iInterfaceQueryLocalInterface7 instanceof G0 ? (G0) iInterfaceQueryLocalInterface7 : new F0(strongBinder7);
                }
                P.f(parcel);
                setInstanceIdProvider(f10);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c6343v10 = iInterfaceQueryLocalInterface8 instanceof InterfaceC6361x0 ? (InterfaceC6361x0) iInterfaceQueryLocalInterface8 : new C6343v0(strongBinder8);
                }
                P.f(parcel);
                getCachedAppInstanceId(c6343v10);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c6343v9 = iInterfaceQueryLocalInterface9 instanceof InterfaceC6361x0 ? (InterfaceC6361x0) iInterfaceQueryLocalInterface9 : new C6343v0(strongBinder9);
                }
                P.f(parcel);
                getAppInstanceId(c6343v9);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c6343v8 = iInterfaceQueryLocalInterface10 instanceof InterfaceC6361x0 ? (InterfaceC6361x0) iInterfaceQueryLocalInterface10 : new C6343v0(strongBinder10);
                }
                P.f(parcel);
                getGmpAppId(c6343v8);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c6343v7 = iInterfaceQueryLocalInterface11 instanceof InterfaceC6361x0 ? (InterfaceC6361x0) iInterfaceQueryLocalInterface11 : new C6343v0(strongBinder11);
                }
                P.f(parcel);
                generateEventId(c6343v7);
                break;
            case 23:
                String string17 = parcel.readString();
                long j21 = parcel.readLong();
                P.f(parcel);
                beginAdUnitExposure(string17, j21);
                break;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                String string18 = parcel.readString();
                long j22 = parcel.readLong();
                P.f(parcel);
                endAdUnitExposure(string18, j22);
                break;
            case 25:
                com.google.android.gms.dynamic.a aVarJ4 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                long j23 = parcel.readLong();
                P.f(parcel);
                onActivityStarted(aVarJ4, j23);
                break;
            case 26:
                com.google.android.gms.dynamic.a aVarJ5 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                long j24 = parcel.readLong();
                P.f(parcel);
                onActivityStopped(aVarJ5, j24);
                break;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                com.google.android.gms.dynamic.a aVarJ6 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) P.b(parcel, Bundle.CREATOR);
                long j25 = parcel.readLong();
                P.f(parcel);
                onActivityCreated(aVarJ6, bundle5, j25);
                break;
            case 28:
                com.google.android.gms.dynamic.a aVarJ7 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                long j26 = parcel.readLong();
                P.f(parcel);
                onActivityDestroyed(aVarJ7, j26);
                break;
            case 29:
                com.google.android.gms.dynamic.a aVarJ8 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                long j27 = parcel.readLong();
                P.f(parcel);
                onActivityPaused(aVarJ8, j27);
                break;
            case 30:
                com.google.android.gms.dynamic.a aVarJ9 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                long j28 = parcel.readLong();
                P.f(parcel);
                onActivityResumed(aVarJ9, j28);
                break;
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                com.google.android.gms.dynamic.a aVarJ10 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c6343v6 = iInterfaceQueryLocalInterface12 instanceof InterfaceC6361x0 ? (InterfaceC6361x0) iInterfaceQueryLocalInterface12 : new C6343v0(strongBinder12);
                }
                long j29 = parcel.readLong();
                P.f(parcel);
                onActivitySaveInstanceState(aVarJ10, c6343v6, j29);
                break;
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                Bundle bundle6 = (Bundle) P.b(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c6343v5 = iInterfaceQueryLocalInterface13 instanceof InterfaceC6361x0 ? (InterfaceC6361x0) iInterfaceQueryLocalInterface13 : new C6343v0(strongBinder13);
                }
                long j30 = parcel.readLong();
                P.f(parcel);
                performAction(bundle6, c6343v5, j30);
                break;
            case 33:
                int i12 = parcel.readInt();
                String string19 = parcel.readString();
                com.google.android.gms.dynamic.a aVarJ11 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                com.google.android.gms.dynamic.a aVarJ12 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                com.google.android.gms.dynamic.a aVarJ13 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                P.f(parcel);
                logHealthData(i12, string19, aVarJ11, aVarJ12, aVarJ13);
                break;
            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    b12 = iInterfaceQueryLocalInterface14 instanceof E0 ? (E0) iInterfaceQueryLocalInterface14 : new B0(strongBinder14);
                }
                P.f(parcel);
                setEventInterceptor(b12);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    b11 = iInterfaceQueryLocalInterface15 instanceof E0 ? (E0) iInterfaceQueryLocalInterface15 : new B0(strongBinder15);
                }
                P.f(parcel);
                registerOnMeasurementEventListener(b11);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    b10 = iInterfaceQueryLocalInterface16 instanceof E0 ? (E0) iInterfaceQueryLocalInterface16 : new B0(strongBinder16);
                }
                P.f(parcel);
                unregisterOnMeasurementEventListener(b10);
                break;
            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                HashMap mapE = P.e(parcel);
                P.f(parcel);
                initForTests(mapE);
                break;
            case TTAdConstant.CONVERSION_LINK_LANDING_PAGE_CEILING /* 38 */:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c6343v4 = iInterfaceQueryLocalInterface17 instanceof InterfaceC6361x0 ? (InterfaceC6361x0) iInterfaceQueryLocalInterface17 : new C6343v0(strongBinder17);
                }
                int i13 = parcel.readInt();
                P.f(parcel);
                getTestFlag(c6343v4, i13);
                break;
            case 39:
                boolean zA6 = P.a(parcel);
                P.f(parcel);
                setDataCollectionEnabled(zA6);
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c6343v3 = iInterfaceQueryLocalInterface18 instanceof InterfaceC6361x0 ? (InterfaceC6361x0) iInterfaceQueryLocalInterface18 : new C6343v0(strongBinder18);
                }
                P.f(parcel);
                isDataCollectionEnabled(c6343v3);
                break;
            case 41:
            case 47:
            case 49:
            default:
                return false;
            case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                Bundle bundle7 = (Bundle) P.b(parcel, Bundle.CREATOR);
                P.f(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_FEED /* 43 */:
                long j31 = parcel.readLong();
                P.f(parcel);
                clearMeasurementEnabled(j31);
                break;
            case 44:
                Bundle bundle8 = (Bundle) P.b(parcel, Bundle.CREATOR);
                long j32 = parcel.readLong();
                P.f(parcel);
                setConsent(bundle8, j32);
                break;
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                Bundle bundle9 = (Bundle) P.b(parcel, Bundle.CREATOR);
                long j33 = parcel.readLong();
                P.f(parcel);
                setConsentThirdParty(bundle9, j33);
                break;
            case 46:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c6343v2 = iInterfaceQueryLocalInterface19 instanceof InterfaceC6361x0 ? (InterfaceC6361x0) iInterfaceQueryLocalInterface19 : new C6343v0(strongBinder19);
                }
                P.f(parcel);
                getSessionId(c6343v2);
                break;
            case 48:
                Intent intent = (Intent) P.b(parcel, Intent.CREATOR);
                P.f(parcel);
                setSgtmDebugInfo(intent);
                break;
            case 50:
                J0 j34 = (J0) P.b(parcel, J0.CREATOR);
                String string20 = parcel.readString();
                String string21 = parcel.readString();
                long j35 = parcel.readLong();
                P.f(parcel);
                setCurrentScreenByScionActivityInfo(j34, string20, string21, j35);
                break;
            case 51:
                J0 j36 = (J0) P.b(parcel, J0.CREATOR);
                long j37 = parcel.readLong();
                P.f(parcel);
                onActivityStartedByScionActivityInfo(j36, j37);
                break;
            case 52:
                J0 j38 = (J0) P.b(parcel, J0.CREATOR);
                long j39 = parcel.readLong();
                P.f(parcel);
                onActivityStoppedByScionActivityInfo(j38, j39);
                break;
            case 53:
                J0 j40 = (J0) P.b(parcel, J0.CREATOR);
                Bundle bundle10 = (Bundle) P.b(parcel, Bundle.CREATOR);
                long j41 = parcel.readLong();
                P.f(parcel);
                onActivityCreatedByScionActivityInfo(j40, bundle10, j41);
                break;
            case 54:
                J0 j42 = (J0) P.b(parcel, J0.CREATOR);
                long j43 = parcel.readLong();
                P.f(parcel);
                onActivityDestroyedByScionActivityInfo(j42, j43);
                break;
            case 55:
                J0 j44 = (J0) P.b(parcel, J0.CREATOR);
                long j45 = parcel.readLong();
                P.f(parcel);
                onActivityPausedByScionActivityInfo(j44, j45);
                break;
            case 56:
                J0 j46 = (J0) P.b(parcel, J0.CREATOR);
                long j47 = parcel.readLong();
                P.f(parcel);
                onActivityResumedByScionActivityInfo(j46, j47);
                break;
            case 57:
                J0 j48 = (J0) P.b(parcel, J0.CREATOR);
                IBinder strongBinder20 = parcel.readStrongBinder();
                if (strongBinder20 != null) {
                    IInterface iInterfaceQueryLocalInterface20 = strongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c6343v1 = iInterfaceQueryLocalInterface20 instanceof InterfaceC6361x0 ? (InterfaceC6361x0) iInterfaceQueryLocalInterface20 : new C6343v0(strongBinder20);
                }
                long j49 = parcel.readLong();
                P.f(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(j48, c6343v1, j49);
                break;
            case 58:
                IBinder strongBinder21 = parcel.readStrongBinder();
                if (strongBinder21 != null) {
                    IInterface iInterfaceQueryLocalInterface21 = strongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    c6369y0 = iInterfaceQueryLocalInterface21 instanceof A0 ? (A0) iInterfaceQueryLocalInterface21 : new C6369y0(strongBinder21);
                }
                P.f(parcel);
                retrieveAndUploadBatches(c6369y0);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}

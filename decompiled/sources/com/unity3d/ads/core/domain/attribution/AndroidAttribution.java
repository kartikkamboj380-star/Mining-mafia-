package com.unity3d.ads.core.domain.attribution;

import I8.AbstractC0695t0;
import K.m;
import L8.K;
import android.adservices.AdServicesState;
import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.OutcomeReceiver;
import android.os.ext.SdkExtensions;
import android.view.InputEvent;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.WebViewContainer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.domain.ISDKDispatchers;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p129m8.g;
import p169q8.b;
import p191t0.d;
import p191t0.e;

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
@SuppressLint({"NewApi", "MissingPermission"})
public final class AndroidAttribution {

    @NotNull
    private final ISDKDispatchers dispatchers;

    @NotNull
    private final Lazy measurementManager$delegate;

    @NotNull
    private final SessionRepository sessionRepository;

    public AndroidAttribution(@NotNull Context context, @NotNull ISDKDispatchers dispatchers, @NotNull SessionRepository sessionRepository) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.dispatchers = dispatchers;
        this.sessionRepository = sessionRepository;
        this.measurementManager$delegate = g.a(new AndroidAttribution$measurementManager$2(this, context));
    }

    private final MeasurementManager getMeasurementManager() {
        return e.a(this.measurementManager$delegate.getValue());
    }

    private final Uri getUri(String str, AdObject adObject) {
        Uri uri = Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(uri, "parse(this)");
        Uri uriBuild = uri.buildUpon().appendQueryParameter("sessionToken", ProtobufExtensionsKt.toBase64$default(this.sessionRepository.getSessionToken(), false, 1, null)).appendQueryParameter(HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, ProtobufExtensionsKt.toBase64$default(adObject.getTrackingToken(), false, 1, null)).build();
        Intrinsics.checkNotNullExpressionValue(uriBuild, "baseUrl.toUri()\n        …4())\n            .build()");
        return uriBuild;
    }

    @Nullable
    public final Object isAvailable(@NotNull b bVar) throws Throwable {
        Unit unit;
        if (Device.getApiLevel() < 33) {
            return kotlin.coroutines.jvm.internal.b.a(false);
        }
        if (SdkExtensions.getExtensionVersion(1000000) < 4) {
            return kotlin.coroutines.jvm.internal.b.a(false);
        }
        if (getMeasurementManager() == null) {
            return kotlin.coroutines.jvm.internal.b.a(false);
        }
        if (!AdServicesState.isAdServicesStateEnabled()) {
            return kotlin.coroutines.jvm.internal.b.a(false);
        }
        final p169q8.e eVar = new p169q8.e(p179r8.b.c(bVar));
        MeasurementManager measurementManager = getMeasurementManager();
        if (measurementManager != null) {
            measurementManager.getMeasurementApiStatus(AbstractC0695t0.a(this.dispatchers.getDefault()), m.a(new OutcomeReceiver() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$isAvailable$2$1
                public /* bridge */ /* synthetic */ void onResult(Object obj) {
                    onResult(((Number) obj).intValue());
                }

                public void onError(@NotNull Exception error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    b bVar2 = eVar;
                    m8.m.a aVar = p129m8.m.f46450b;
                    bVar2.resumeWith(p129m8.m.b(Boolean.FALSE));
                }

                public void onResult(int i10) {
                    b bVar2 = eVar;
                    m8.m.a aVar = p129m8.m.f46450b;
                    bVar2.resumeWith(p129m8.m.b(Boolean.valueOf(i10 == 1)));
                }
            }));
            unit = Unit.f45918a;
        } else {
            unit = null;
        }
        if (unit == null) {
            m8.m.a aVar = p129m8.m.f46450b;
            eVar.resumeWith(p129m8.m.b(kotlin.coroutines.jvm.internal.b.a(false)));
        }
        Object objC = eVar.c();
        if (objC == p179r8.b.e()) {
            h.c(bVar);
        }
        return objC;
    }

    @Nullable
    public final Object registerClick(@NotNull String str, @NotNull AdObject adObject, @NotNull b bVar) throws Throwable {
        WebViewContainer webViewContainer;
        K lastInputEvent;
        InputEvent inputEvent;
        Unit unit;
        if (getMeasurementManager() == null) {
            return kotlin.coroutines.jvm.internal.b.a(false);
        }
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer == null || (webViewContainer = adPlayer.getWebViewContainer()) == null || (lastInputEvent = webViewContainer.getLastInputEvent()) == null || (inputEvent = (InputEvent) lastInputEvent.getValue()) == null) {
            return kotlin.coroutines.jvm.internal.b.a(false);
        }
        final p169q8.e eVar = new p169q8.e(p179r8.b.c(bVar));
        MeasurementManager measurementManager = getMeasurementManager();
        if (measurementManager != null) {
            measurementManager.registerSource(getUri(str, adObject), inputEvent, AbstractC0695t0.a(this.dispatchers.getDefault()), m.a(new OutcomeReceiver() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$registerClick$2$1
                public void onResult(@NotNull Object p10) {
                    Intrinsics.checkNotNullParameter(p10, "p0");
                    b bVar2 = eVar;
                    m8.m.a aVar = p129m8.m.f46450b;
                    bVar2.resumeWith(p129m8.m.b(Boolean.TRUE));
                }

                public void onError(@NotNull Exception error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    b bVar2 = eVar;
                    m8.m.a aVar = p129m8.m.f46450b;
                    bVar2.resumeWith(p129m8.m.b(Boolean.FALSE));
                }
            }));
            unit = Unit.f45918a;
        } else {
            unit = null;
        }
        if (unit == null) {
            m8.m.a aVar = p129m8.m.f46450b;
            eVar.resumeWith(p129m8.m.b(kotlin.coroutines.jvm.internal.b.a(false)));
        }
        Object objC = eVar.c();
        if (objC == p179r8.b.e()) {
            h.c(bVar);
        }
        return objC;
    }

    @Nullable
    public final Object registerView(@NotNull String str, @NotNull AdObject adObject, @NotNull b bVar) throws Throwable {
        if (getMeasurementManager() == null) {
            return kotlin.coroutines.jvm.internal.b.a(false);
        }
        final p169q8.e eVar = new p169q8.e(p179r8.b.c(bVar));
        MeasurementManager measurementManager = getMeasurementManager();
        Unit unit = null;
        if (measurementManager != null) {
            measurementManager.registerSource(getUri(str, adObject), null, AbstractC0695t0.a(this.dispatchers.getDefault()), m.a(new OutcomeReceiver() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$registerView$2$1
                public void onResult(@NotNull Object p10) {
                    Intrinsics.checkNotNullParameter(p10, "p0");
                    b bVar2 = eVar;
                    m8.m.a aVar = p129m8.m.f46450b;
                    bVar2.resumeWith(p129m8.m.b(Boolean.TRUE));
                }

                public void onError(@NotNull Exception error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    b bVar2 = eVar;
                    m8.m.a aVar = p129m8.m.f46450b;
                    bVar2.resumeWith(p129m8.m.b(Boolean.FALSE));
                }
            }));
            unit = Unit.f45918a;
        }
        if (unit == null) {
            m8.m.a aVar = p129m8.m.f46450b;
            eVar.resumeWith(p129m8.m.b(kotlin.coroutines.jvm.internal.b.a(false)));
        }
        Object objC = eVar.c();
        if (objC == p179r8.b.e()) {
            h.c(bVar);
        }
        return objC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MeasurementManager getMeasurementManager(Context context) {
        if (Device.getApiLevel() >= 33 && SdkExtensions.getExtensionVersion(1000000) >= 4) {
            return e.a(context.getSystemService(d.a()));
        }
        return null;
    }
}

package com.tenjin.android.utils;

import android.content.Context;
import android.util.Log;
import com.tenjin.android.config.TenjinConsts;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import p176r5.InterfaceC7089f;
import p176r5.InterfaceC7090g;

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
public final class AppSetIdProvider {

    @Nullable
    private String appSetId;

    @Nullable
    private String appSetIdScope;

    public AppSetIdProvider(@Nullable Context context) {
        if (context == null) {
            Log.d(TenjinConsts.LOG_TAG, "AppSetIdProvider: Context is null, skipping initialization");
            return;
        }
        try {
            Log.d(TenjinConsts.LOG_TAG, "AppSetIdProvider: Initializing...");
            Log.d(TenjinConsts.LOG_TAG, "AppSetIdProvider: AppSet class found, fetching ID...");
            fetchAppSetId(context);
            Log.d(TenjinConsts.LOG_TAG, "AppSetIdProvider: Completed. ID=" + this.appSetId + ", Scope=" + this.appSetIdScope);
        } catch (ClassNotFoundException unused) {
            Log.d(TenjinConsts.LOG_TAG, "AppSetIdProvider: AppSet library not available (ClassNotFoundException)");
        } catch (Exception e10) {
            Log.d(TenjinConsts.LOG_TAG, "AppSet ID not available: " + e10.getMessage());
        } catch (NoClassDefFoundError unused2) {
            Log.d(TenjinConsts.LOG_TAG, "AppSetIdProvider: AppSet classes not found at runtime (NoClassDefFoundError)");
        }
    }

    private final void fetchAppSetId(Context context) {
        Object objInvoke;
        try {
            Object objInvoke2 = W4.a.class.getMethod("getClient", Context.class).invoke(null, context);
            if (objInvoke2 == null || (objInvoke = objInvoke2.getClass().getMethod("getAppSetIdInfo", null).invoke(objInvoke2, null)) == null) {
                return;
            }
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final Object[] objArr = new Object[1];
            Object objNewProxyInstance = Proxy.newProxyInstance(AppSetIdProvider.class.getClassLoader(), new Class[]{InterfaceC7090g.class}, new InvocationHandler() { // from class: com.tenjin.android.utils.a
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method, Object[] objArr2) {
                    return AppSetIdProvider.fetchAppSetId$lambda$0(objArr, countDownLatch, obj, method, objArr2);
                }
            });
            Object objNewProxyInstance2 = Proxy.newProxyInstance(AppSetIdProvider.class.getClassLoader(), new Class[]{InterfaceC7089f.class}, new InvocationHandler() { // from class: com.tenjin.android.utils.b
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method, Object[] objArr2) {
                    return AppSetIdProvider.fetchAppSetId$lambda$1(countDownLatch, obj, method, objArr2);
                }
            });
            Object objInvoke3 = objInvoke.getClass().getMethod("addOnSuccessListener", InterfaceC7090g.class).invoke(objInvoke, objNewProxyInstance);
            objInvoke3.getClass().getMethod("addOnFailureListener", InterfaceC7089f.class).invoke(objInvoke3, objNewProxyInstance2);
            if (!countDownLatch.await(2L, TimeUnit.SECONDS)) {
                Log.d(TenjinConsts.LOG_TAG, "AppSetIdProvider: Timeout waiting for AppSet ID callback (2 seconds)");
                return;
            }
            if (objArr[0] == null) {
                Log.d(TenjinConsts.LOG_TAG, "AppSetIdProvider: Callback completed but result is null");
                return;
            }
            Log.d(TenjinConsts.LOG_TAG, "AppSetIdProvider: Callback completed successfully");
            Object obj = objArr[0];
            Intrinsics.c(obj);
            parseAppSetIdInfo(obj);
        } catch (Exception e10) {
            Log.d(TenjinConsts.LOG_TAG, "Error fetching AppSet ID: " + e10.getClass().getSimpleName() + " - " + e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object fetchAppSetId$lambda$0(Object[] result, CountDownLatch latch, Object obj, Method method, Object[] objArr) {
        Intrinsics.checkNotNullParameter(result, "$result");
        Intrinsics.checkNotNullParameter(latch, "$latch");
        if (Intrinsics.b(method.getName(), "onSuccess")) {
            result[0] = objArr != null ? objArr[0] : null;
            latch.countDown();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object fetchAppSetId$lambda$1(CountDownLatch latch, Object obj, Method method, Object[] objArr) {
        Intrinsics.checkNotNullParameter(latch, "$latch");
        if (Intrinsics.b(method.getName(), "onFailure")) {
            Log.d(TenjinConsts.LOG_TAG, "AppSet ID fetch failed: " + (objArr != null ? objArr[0] : null));
            latch.countDown();
        }
        return null;
    }

    private final void parseAppSetIdInfo(Object obj) {
        try {
            Class<?> cls = obj.getClass();
            Method method = cls.getMethod("getId", null);
            Method method2 = cls.getMethod("getScope", null);
            this.appSetId = (String) method.invoke(obj, null);
            Object objInvoke = method2.invoke(obj, null);
            Intrinsics.d(objInvoke, "null cannot be cast to non-null type kotlin.Int");
            this.appSetIdScope = ((Integer) objInvoke).intValue() == W4.c.class.getField("SCOPE_APP").getInt(null) ? "app" : "developer";
            Log.d(TenjinConsts.LOG_TAG, "AppSet ID retrieved successfully");
        } catch (Exception e10) {
            Log.d(TenjinConsts.LOG_TAG, "Error parsing AppSet ID: " + e10.getMessage());
        }
    }

    @Nullable
    public final String getAppSetId() {
        return this.appSetId;
    }

    @Nullable
    public final String getAppSetIdScope() {
        return this.appSetIdScope;
    }
}

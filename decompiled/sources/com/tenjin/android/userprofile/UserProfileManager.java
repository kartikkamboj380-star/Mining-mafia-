package com.tenjin.android.userprofile;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.tenjin.android.config.TenjinConsts;
import com.tenjin.android.store.TenjinDatasource;
import com.tenjin.android.userprofile.UserProfileManager;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:31)
    */
/* JADX INFO: loaded from: classes3.dex */
@Metadata
public final class UserProfileManager implements Application.ActivityLifecycleCallbacks {

    @Nullable
    private static volatile UserProfileManager instance;

    @NotNull
    private final AtomicInteger activeActivityCount;

    @NotNull
    private final WeakReference<Application> applicationReference;

    @NotNull
    private final TenjinDatasource datasource;

    @NotNull
    private final ExecutorService executorService;

    @NotNull
    private UserProfileData profileData;

    @NotNull
    public static final Companion Companion = new Companion(null);
    private static long sessionTimeoutMs = TenjinConsts.SESSION_TIMEOUT_MS;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getSessionTimeoutMs$annotations() {
        }

        public final void clearInstance$tenjin_release() {
            UserProfileManager userProfileManager = UserProfileManager.instance;
            if (userProfileManager != null) {
                userProfileManager.destroy();
            }
            UserProfileManager.instance = null;
        }

        @NotNull
        public final UserProfileManager getInstance(@NotNull Context context, @NotNull TenjinDatasource datasource) {
            UserProfileManager userProfileManager;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(datasource, "datasource");
            UserProfileManager userProfileManager2 = UserProfileManager.instance;
            if (userProfileManager2 != null) {
                return userProfileManager2;
            }
            synchronized (this) {
                userProfileManager = UserProfileManager.instance;
                if (userProfileManager == null) {
                    userProfileManager = new UserProfileManager(context, datasource, null);
                    UserProfileManager.instance = userProfileManager;
                }
            }
            return userProfileManager;
        }

        public final long getSessionTimeoutMs() {
            return UserProfileManager.sessionTimeoutMs;
        }

        public final void setSessionTimeoutMs(long j10) {
            UserProfileManager.sessionTimeoutMs = j10;
        }

        private Companion() {
        }
    }

    public /* synthetic */ UserProfileManager(Context context, TenjinDatasource tenjinDatasource, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, tenjinDatasource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(UserProfileManager this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.profileData.resumeOrStartSession(sessionTimeoutMs);
        this$0.saveToStorage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void endSession$lambda$3(UserProfileManager this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.profileData.endSession();
        this$0.saveToStorage();
    }

    @NotNull
    public static final UserProfileManager getInstance(@NotNull Context context, @NotNull TenjinDatasource tenjinDatasource) {
        return Companion.getInstance(context, tenjinDatasource);
    }

    public static final long getSessionTimeoutMs() {
        return Companion.getSessionTimeoutMs();
    }

    private final UserProfileData loadFromStorage() {
        return UserProfileData.Companion.fromJson(this.datasource.getUserProfileData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onActivityStarted$lambda$1(UserProfileManager this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.profileData.resumeOrStartSession(sessionTimeoutMs);
        this$0.saveToStorage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onActivityStopped$lambda$2(UserProfileManager this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.profileData.pauseSession();
        this$0.saveToStorage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void recordIAPTransaction$lambda$5(UserProfileManager this$0, String str, String str2, double d10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.profileData.recordIAPTransaction(str, str2, d10);
        this$0.saveToStorage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void recordILRDRevenue$lambda$6(UserProfileManager this$0, String str, double d10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.profileData.recordILRDRevenue(str, d10);
        this$0.saveToStorage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resetProfile$lambda$4(UserProfileManager this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        UserProfileData userProfileData = new UserProfileData();
        this$0.profileData = userProfileData;
        userProfileData.resumeOrStartSession(sessionTimeoutMs);
        this$0.saveToStorage();
    }

    private final void saveToStorage() {
        this.datasource.setUserProfileData(this.profileData.toJson());
    }

    public static final void setSessionTimeoutMs(long j10) {
        Companion.setSessionTimeoutMs(j10);
    }

    private final void setupLifecycleCallbacks() {
        try {
            Application application = this.applicationReference.get();
            if (application != null) {
                application.registerActivityLifecycleCallbacks(this);
            }
        } catch (Exception unused) {
        }
    }

    public final void destroy() {
        try {
            Application application = this.applicationReference.get();
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(this);
            }
        } catch (Exception unused) {
        }
        this.executorService.shutdown();
    }

    public final void endSession() {
        this.executorService.execute(new Runnable() { // from class: S7.e
            @Override // java.lang.Runnable
            public final void run() {
                UserProfileManager.endSession$lambda$3(this.f5533a);
            }
        });
    }

    @NotNull
    public final UserProfileData getProfileData() {
        return this.profileData;
    }

    @NotNull
    public final Map<String, Object> getProfileDictionary() {
        return this.profileData.toDictionary();
    }

    @NotNull
    public final Map<String, String> getScalarProfileMap() {
        return this.profileData.toScalarMap();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.activeActivityCount.incrementAndGet() == 1) {
            this.executorService.execute(new Runnable() { // from class: S7.g
                @Override // java.lang.Runnable
                public final void run() {
                    UserProfileManager.onActivityStarted$lambda$1(this.f5535a);
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.activeActivityCount.decrementAndGet() == 0) {
            this.executorService.execute(new Runnable() { // from class: S7.b
                @Override // java.lang.Runnable
                public final void run() {
                    UserProfileManager.onActivityStopped$lambda$2(this.f5527a);
                }
            });
        }
    }

    public final void recordIAPTransaction(@Nullable final String str, @Nullable final String str2, final double d10) {
        this.executorService.execute(new Runnable() { // from class: S7.c
            @Override // java.lang.Runnable
            public final void run() {
                UserProfileManager.recordIAPTransaction$lambda$5(this.f5528a, str, str2, d10);
            }
        });
    }

    public final void recordILRDRevenue(@Nullable final String str, final double d10) {
        this.executorService.execute(new Runnable() { // from class: S7.a
            @Override // java.lang.Runnable
            public final void run() {
                UserProfileManager.recordILRDRevenue$lambda$6(this.f5524a, str, d10);
            }
        });
    }

    public final void resetProfile() {
        this.executorService.execute(new Runnable() { // from class: S7.d
            @Override // java.lang.Runnable
            public final void run() {
                UserProfileManager.resetProfile$lambda$4(this.f5532a);
            }
        });
    }

    private UserProfileManager(Context context, TenjinDatasource tenjinDatasource) {
        this.datasource = tenjinDatasource;
        Context applicationContext = context.getApplicationContext();
        this.applicationReference = new WeakReference<>(applicationContext instanceof Application ? (Application) applicationContext : null);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.executorService = executorServiceNewSingleThreadExecutor;
        this.activeActivityCount = new AtomicInteger(0);
        this.profileData = loadFromStorage();
        setupLifecycleCallbacks();
        executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: S7.f
            @Override // java.lang.Runnable
            public final void run() {
                UserProfileManager._init_$lambda$0(this.f5534a);
            }
        });
    }
}

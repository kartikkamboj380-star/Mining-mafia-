package X4;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.internal.AccountType;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.auth.AbstractBinderC6099k0;
import com.google.android.gms.internal.auth.AbstractC6118q1;
import com.google.android.gms.internal.auth.C6086g;
import com.google.android.gms.internal.auth.EnumC6092i;
import com.google.android.gms.internal.auth.I1;
import com.google.android.gms.internal.auth.InterfaceC6076c1;
import com.google.android.gms.internal.auth.L1;
import com.google.android.gms.internal.auth.M;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import p176r5.AbstractC7096m;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f6704a = {AccountType.GOOGLE, "com.google.work", "cn.google"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f6705b = "androidPackageName";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ComponentName f6706c = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Logger f6707d = d.a("GoogleAuthUtil");

    public static void a(Context context, String str) throws a, IOException {
        g(context, str, 0L);
    }

    public static String b(Context context, Account account, String str) {
        return c(context, account, str, new Bundle());
    }

    public static String c(Context context, Account account, String str, Bundle bundle) {
        p(account);
        return d(context, account, str, bundle, 0L, null).zza();
    }

    public static TokenData d(final Context context, final Account account, final String str, Bundle bundle, long j10, Executor executor) throws a, IOException {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        Preconditions.checkNotEmpty(str, "Scope cannot be empty or null.");
        p(account);
        l(context, 8400000);
        final Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        n(context, bundle2);
        M.d(context);
        if (L1.c() && q(context)) {
            try {
                Bundle bundle3 = (Bundle) j(AbstractC6118q1.a(context).c(account, str, bundle2), "token retrieval");
                k(bundle3);
                return h(context, "getTokenWithDetails", bundle3);
            } catch (ApiException e10) {
                m(e10, "token retrieval");
            }
        }
        return (TokenData) i(context, f6706c, new h() { // from class: X4.f
            @Override // X4.h
            public final Object a(IBinder iBinder) {
                return i.e(account, str, bundle2, context, iBinder);
            }
        }, 0L, null);
    }

    static /* synthetic */ TokenData e(Account account, String str, Bundle bundle, Context context, IBinder iBinder) throws IOException {
        Bundle bundleG4 = AbstractBinderC6099k0.h0(iBinder).g4(account, str, bundle);
        if (bundleG4 != null) {
            return h(context, "getTokenWithDetails", bundleG4);
        }
        throw new IOException("Service call returned null");
    }

    static /* bridge */ /* synthetic */ Object f(Object obj) throws IOException {
        k(obj);
        return obj;
    }

    public static void g(Context context, String str, long j10) throws a, IOException {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        l(context, 8400000);
        Bundle bundle = new Bundle();
        n(context, bundle);
        M.d(context);
        if (L1.c() && q(context)) {
            InterfaceC6076c1 interfaceC6076c1A = AbstractC6118q1.a(context);
            C6086g c6086g = new C6086g();
            c6086g.a(str);
            try {
                j(interfaceC6076c1A.a(c6086g), "clear token");
                return;
            } catch (ApiException e10) {
                m(e10, "clear token");
            }
        }
        i(context, f6706c, new g(str, bundle), 0L, null);
    }

    private static TokenData h(Context context, String str, Bundle bundle) throws a, IOException {
        TokenData tokenData;
        Parcelable.Creator<TokenData> creator = TokenData.CREATOR;
        ClassLoader classLoader = TokenData.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        Bundle bundle2 = bundle.getBundle("tokenDetails");
        if (bundle2 == null) {
            tokenData = null;
        } else {
            if (classLoader != null) {
                bundle2.setClassLoader(classLoader);
            }
            tokenData = (TokenData) bundle2.getParcelable("TokenData");
        }
        if (tokenData != null) {
            return tokenData;
        }
        o(context, "getTokenWithDetails", bundle.getString("Error"), (Intent) bundle.getParcelable("userRecoveryIntent"), (PendingIntent) bundle.getParcelable("userRecoveryPendingIntent"));
        throw new a("Invalid state. Shouldn't happen");
    }

    private static Object i(Context context, ComponentName componentName, h hVar, long j10, Executor executor) throws IOException {
        BlockingServiceConnection blockingServiceConnection = new BlockingServiceConnection();
        GmsClientSupervisor gmsClientSupervisor = GmsClientSupervisor.getInstance(context);
        try {
            try {
                if (!gmsClientSupervisor.bindService(componentName, blockingServiceConnection, "GoogleAuthUtil", null)) {
                    throw new IOException("Could not bind to service.");
                }
                try {
                    Object objA = hVar.a(blockingServiceConnection.getService());
                    gmsClientSupervisor.unbindService(componentName, blockingServiceConnection, "GoogleAuthUtil");
                    return objA;
                } catch (RemoteException | InterruptedException | TimeoutException e10) {
                    Log.i("GoogleAuthUtil", "Error on service connection.", e10);
                    throw new IOException("Error on service connection.", e10);
                }
            } catch (Throwable th) {
                gmsClientSupervisor.unbindService(componentName, blockingServiceConnection, "GoogleAuthUtil");
                throw th;
            }
        } catch (SecurityException e11) {
            Log.w("GoogleAuthUtil", String.format("SecurityException while bind to auth service: %s", e11.getMessage()));
            throw new IOException("SecurityException while binding to Auth service.", e11);
        }
    }

    private static Object j(Task task, String str) throws IOException, ApiException {
        try {
            return AbstractC7096m.a(task);
        } catch (InterruptedException e10) {
            String str2 = String.format("Interrupted while waiting for the task of %s to finish.", str);
            f6707d.w(str2, new Object[0]);
            throw new IOException(str2, e10);
        } catch (CancellationException e11) {
            String str3 = String.format("Canceled while waiting for the task of %s to finish.", str);
            f6707d.w(str3, new Object[0]);
            throw new IOException(str3, e11);
        } catch (ExecutionException e12) {
            Throwable cause = e12.getCause();
            if (cause instanceof ApiException) {
                throw ((ApiException) cause);
            }
            String str4 = String.format("Unable to get a result for %s due to ExecutionException.", str);
            f6707d.w(str4, new Object[0]);
            throw new IOException(str4, e12);
        }
    }

    private static Object k(Object obj) throws IOException {
        if (obj != null) {
            return obj;
        }
        f6707d.w("Service call returned null.", new Object[0]);
        throw new IOException("Service unavailable.");
    }

    private static void l(Context context, int i10) throws a {
        try {
            GooglePlayServicesUtilLight.ensurePlayServicesAvailable(context.getApplicationContext(), i10);
        } catch (GooglePlayServicesIncorrectManifestValueException | GooglePlayServicesNotAvailableException e10) {
            throw new a(e10.getMessage(), e10);
        } catch (GooglePlayServicesRepairableException e11) {
            throw new c(e11.getConnectionStatusCode(), e11.getMessage(), e11.getIntent());
        }
    }

    private static void m(ApiException apiException, String str) {
        f6707d.w("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", str, Log.getStackTraceString(apiException));
    }

    private static void n(Context context, Bundle bundle) {
        String str = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str);
        String str2 = f6705b;
        if (TextUtils.isEmpty(bundle.getString(str2))) {
            bundle.putString(str2, str);
        }
        bundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
    }

    private static void o(Context context, String str, String str2, Intent intent, PendingIntent pendingIntent) throws a, IOException {
        EnumC6092i enumC6092iC = EnumC6092i.c(str2);
        Logger logger = f6707d;
        logger.w(String.format("[GoogleAuthUtil] error status:%s with method:%s", enumC6092iC, str), new Object[0]);
        if (!EnumC6092i.BAD_AUTHENTICATION.equals(enumC6092iC) && !EnumC6092i.CAPTCHA.equals(enumC6092iC) && !EnumC6092i.NEED_PERMISSION.equals(enumC6092iC) && !EnumC6092i.NEED_REMOTE_CONSENT.equals(enumC6092iC) && !EnumC6092i.NEEDS_BROWSER.equals(enumC6092iC) && !EnumC6092i.USER_CANCEL.equals(enumC6092iC) && !EnumC6092i.DEVICE_MANAGEMENT_REQUIRED.equals(enumC6092iC) && !EnumC6092i.DM_INTERNAL_ERROR.equals(enumC6092iC) && !EnumC6092i.DM_SYNC_DISABLED.equals(enumC6092iC) && !EnumC6092i.DM_ADMIN_BLOCKED.equals(enumC6092iC) && !EnumC6092i.DM_ADMIN_PENDING_APPROVAL.equals(enumC6092iC) && !EnumC6092i.DM_STALE_SYNC_REQUIRED.equals(enumC6092iC) && !EnumC6092i.DM_DEACTIVATED.equals(enumC6092iC) && !EnumC6092i.DM_REQUIRED.equals(enumC6092iC) && !EnumC6092i.THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(enumC6092iC) && !EnumC6092i.DM_SCREENLOCK_REQUIRED.equals(enumC6092iC)) {
            if (!EnumC6092i.NETWORK_ERROR.equals(enumC6092iC) && !EnumC6092i.SERVICE_UNAVAILABLE.equals(enumC6092iC) && !EnumC6092i.INTNERNAL_ERROR.equals(enumC6092iC) && !EnumC6092i.AUTH_SECURITY_ERROR.equals(enumC6092iC) && !EnumC6092i.ACCOUNT_NOT_PRESENT.equals(enumC6092iC)) {
                throw new a(str2);
            }
            throw new IOException(str2);
        }
        M.d(context);
        if (!I1.b()) {
            throw new UserRecoverableAuthException(str2, intent);
        }
        if (pendingIntent != null && intent != null) {
            throw UserRecoverableAuthException.b(str2, intent, pendingIntent);
        }
        if (GoogleApiAvailability.getInstance().getApkVersion(context) >= Integer.MAX_VALUE && pendingIntent == null) {
            Integer numValueOf = Integer.valueOf(Api.BaseClientBuilder.API_PRIORITY_OTHER);
            logger.e(String.format("Recovery PendingIntent is missing on current Gms version: %s for method: %s. It should always be present on or above Gms version %s. This indicates a bug in Gms implementation.", numValueOf, str, numValueOf), new Object[0]);
        }
        if (intent == null) {
            logger.e(String.format("no recovery Intent found with status=%s for method=%s. This shouldn't happen", str2, str), new Object[0]);
        }
        throw new UserRecoverableAuthException(str2, intent);
    }

    private static void p(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null");
        }
        if (TextUtils.isEmpty(account.name)) {
            throw new IllegalArgumentException("Account name cannot be empty!");
        }
        String[] strArr = f6704a;
        for (int i10 = 0; i10 < 3; i10++) {
            if (strArr[i10].equals(account.type)) {
                return;
            }
        }
        throw new IllegalArgumentException("Account type not supported");
    }

    private static boolean q(Context context) {
        if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context, 17895000) != 0) {
            return false;
        }
        List listQ = L1.a().q();
        String str = context.getApplicationInfo().packageName;
        Iterator it = listQ.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(str)) {
                return false;
            }
        }
        return true;
    }
}

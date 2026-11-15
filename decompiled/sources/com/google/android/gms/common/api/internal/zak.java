package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes2.dex */
public final class zak extends zap {
    private final SparseArray zad;

    private zak(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment, GoogleApiAvailability.getInstance());
        this.zad = new SparseArray();
        this.mLifecycleFragment.addCallback("AutoManageHelper", this);
    }

    public static zak zaa(LifecycleActivity lifecycleActivity) {
        LifecycleFragment fragment = LifecycleCallback.getFragment(lifecycleActivity);
        zak zakVar = (zak) fragment.getCallbackOrNull("AutoManageHelper", zak.class);
        return zakVar != null ? zakVar : new zak(fragment);
    }

    private final U zai(int i10) {
        if (this.zad.size() <= i10) {
            return null;
        }
        SparseArray sparseArray = this.zad;
        return (U) sparseArray.get(sparseArray.keyAt(i10));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i10 = 0; i10 < this.zad.size(); i10++) {
            U uZai = zai(i10);
            if (uZai != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(uZai.f17018a);
                printWriter.println(":");
                uZai.f17019b.dump(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStart() {
        super.onStart();
        SparseArray sparseArray = this.zad;
        Log.d("AutoManageHelper", "onStart " + this.zaa + " " + String.valueOf(sparseArray));
        if (this.zab.get() == null) {
            for (int i10 = 0; i10 < this.zad.size(); i10++) {
                U uZai = zai(i10);
                if (uZai != null) {
                    uZai.f17019b.connect();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        super.onStop();
        for (int i10 = 0; i10 < this.zad.size(); i10++) {
            U uZai = zai(i10);
            if (uZai != null) {
                uZai.f17019b.disconnect();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap
    protected final void zab(ConnectionResult connectionResult, int i10) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i10 < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        U u10 = (U) this.zad.get(i10);
        if (u10 != null) {
            zae(i10);
            GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = u10.f17020c;
            if (onConnectionFailedListener != null) {
                onConnectionFailedListener.onConnectionFailed(connectionResult);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap
    protected final void zac() {
        for (int i10 = 0; i10 < this.zad.size(); i10++) {
            U uZai = zai(i10);
            if (uZai != null) {
                uZai.f17019b.connect();
            }
        }
    }

    public final void zad(int i10, GoogleApiClient googleApiClient, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.checkNotNull(googleApiClient, "GoogleApiClient instance cannot be null");
        Preconditions.checkState(this.zad.indexOfKey(i10) < 0, "Already managing a GoogleApiClient with id " + i10);
        V v10 = (V) this.zab.get();
        Log.d("AutoManageHelper", "starting AutoManage for client " + i10 + " " + this.zaa + " " + String.valueOf(v10));
        U u10 = new U(this, i10, googleApiClient, onConnectionFailedListener);
        googleApiClient.registerConnectionFailedListener(u10);
        this.zad.put(i10, u10);
        if (this.zaa && v10 == null) {
            Log.d("AutoManageHelper", "connecting ".concat(googleApiClient.toString()));
            googleApiClient.connect();
        }
    }

    public final void zae(int i10) {
        U u10 = (U) this.zad.get(i10);
        this.zad.remove(i10);
        if (u10 != null) {
            u10.f17019b.unregisterConnectionFailedListener(u10);
            u10.f17019b.disconnect();
        }
    }
}

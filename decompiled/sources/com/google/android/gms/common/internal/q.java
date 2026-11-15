package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
final class q implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ r f17144a;

    /* synthetic */ q(r rVar, byte[] bArr) {
        java.util.Objects.requireNonNull(rVar);
        this.f17144a = rVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            r rVar = this.f17144a;
            synchronized (rVar.c()) {
                try {
                    zzn zznVar = (zzn) message.obj;
                    p pVar = (p) rVar.c().get(zznVar);
                    if (pVar != null && pVar.g()) {
                        if (pVar.d()) {
                            pVar.a("GmsClientSupervisor");
                        }
                        rVar.c().remove(zznVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        if (i10 != 1) {
            return false;
        }
        r rVar2 = this.f17144a;
        synchronized (rVar2.c()) {
            try {
                zzn zznVar2 = (zzn) message.obj;
                p pVar2 = (p) rVar2.c().get(zznVar2);
                if (pVar2 != null && pVar2.e() == 3) {
                    String strValueOf = String.valueOf(zznVar2);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(strValueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName componentNameI = pVar2.i();
                    if (componentNameI == null) {
                        componentNameI = zznVar2.zzc();
                    }
                    if (componentNameI == null) {
                        String strZzb = zznVar2.zzb();
                        Preconditions.checkNotNull(strZzb);
                        componentNameI = new ComponentName(strZzb, "unknown");
                    }
                    pVar2.onServiceDisconnected(componentNameI);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }
}

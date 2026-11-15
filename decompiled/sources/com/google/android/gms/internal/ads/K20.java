package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class K20 implements InterfaceC3065c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H4.m2 f20048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f20049c;

    public K20(Context context, H4.m2 m2Var, List list) {
        this.f20047a = context;
        this.f20048b = m2Var;
        this.f20049c = list;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        AF af = (AF) obj;
        if (((Boolean) AbstractC4523nj.f31878a.e()).booleanValue()) {
            Bundle bundle = new Bundle();
            G4.t.g();
            String className = null;
            try {
                ActivityManager activityManager = (ActivityManager) this.f20047a.getSystemService("activity");
                if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null && runningTaskInfo.topActivity != null) {
                    className = runningTaskInfo.topActivity.getClassName();
                }
            } catch (Exception unused) {
            }
            bundle.putString("activity", className);
            Bundle bundle2 = new Bundle();
            H4.m2 m2Var = this.f20048b;
            bundle2.putInt("width", m2Var.f1375e);
            bundle2.putInt("height", m2Var.f1372b);
            bundle.putBundle("size", bundle2);
            List list = this.f20049c;
            if (!list.isEmpty()) {
                bundle.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
            }
            af.f17275a.putBundle("view_hierarchy", bundle);
        }
    }
}

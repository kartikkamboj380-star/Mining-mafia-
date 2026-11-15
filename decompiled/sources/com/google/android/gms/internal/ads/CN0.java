package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;

/* JADX INFO: loaded from: classes2.dex */
final class CN0 implements YL0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final YL0 f17868a = new CN0();

    private CN0() {
    }

    @Override // com.google.android.gms.internal.ads.YL0
    public final boolean a(int i10) {
        if (i10 != 0 && i10 != 1 && i10 != 2 && i10 != 1999) {
            switch (i10) {
                case 1000:
                case BackupConstant.SCENE_RENDER_FAIL /* 1001 */:
                case BackupConstant.SCENE_BACKUP_RENDER_FAIL /* 1002 */:
                case BackupConstant.SCENE_CLOSED_WITHOUT_SHOW /* 1003 */:
                case 1004:
                case 1005:
                case 1006:
                case 1007:
                case 1008:
                case 1009:
                case TTAdConstant.IMAGE_MODE_1010 /* 1010 */:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}

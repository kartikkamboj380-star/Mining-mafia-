package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class AV0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AV0 f17344c = new AV0(AbstractC5931yu0.m(C4999rV0.f32913d));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AbstractC5931yu0 f17345d = AbstractC5931yu0.p(2, 5, 6);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final AbstractC1539Bu0 f17346e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseArray f17347a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f17348b;

    static {
        C1487Au0 c1487Au0 = new C1487Au0();
        c1487Au0.a(5, 6);
        c1487Au0.a(17, 6);
        c1487Au0.a(7, 6);
        c1487Au0.a(30, 10);
        c1487Au0.a(18, 6);
        c1487Au0.a(6, 8);
        c1487Au0.a(8, 8);
        c1487Au0.a(14, 8);
        f17346e = c1487Au0.c();
    }

    private AV0(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            C4999rV0 c4999rV0 = (C4999rV0) list.get(i10);
            this.f17347a.put(c4999rV0.f32914a, c4999rV0);
        }
        int iMax = 0;
        for (int i11 = 0; i11 < this.f17347a.size(); i11++) {
            iMax = Math.max(iMax, ((C4999rV0) this.f17347a.valueAt(i11)).f32915b);
        }
        this.f17348b = iMax;
    }

    static AV0 a(Context context, C4966rF c4966rF, AudioDeviceInfo audioDeviceInfo) {
        return b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), c4966rF, audioDeviceInfo);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    static AV0 b(Context context, Intent intent, C4966rF c4966rF, AudioDeviceInfo audioDeviceInfo) {
        AudioManager audioManagerA = AbstractC5304tw.a(context);
        if (audioDeviceInfo == null) {
            if (Build.VERSION.SDK_INT >= 33) {
                List audioDevicesForAttributes = audioManagerA.getAudioDevicesForAttributes(c4966rF.a());
                if (audioDevicesForAttributes.isEmpty()) {
                    audioDeviceInfo = null;
                } else {
                    audioDeviceInfo = (AudioDeviceInfo) audioDevicesForAttributes.get(0);
                }
            } else {
                audioDeviceInfo = null;
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33 && (AbstractC4634ob0.m(context) || AbstractC4634ob0.n(context))) {
            List directProfilesForAttributes = audioManagerA.getDirectProfilesForAttributes(c4966rF.a());
            HashMap map = new HashMap();
            map.put(2, new HashSet(AbstractC5305tw0.g(12)));
            for (int i11 = 0; i11 < directProfilesForAttributes.size(); i11++) {
                AudioProfile audioProfileA = AbstractC5503vV0.a(directProfilesForAttributes.get(i11));
                if (audioProfileA.getEncapsulationType() != 1) {
                    int format = audioProfileA.getFormat();
                    if (AbstractC4634ob0.a(format) || f17346e.containsKey(Integer.valueOf(format))) {
                        Integer numValueOf = Integer.valueOf(format);
                        if (map.containsKey(numValueOf)) {
                            Set set = (Set) map.get(numValueOf);
                            set.getClass();
                            set.addAll(AbstractC5305tw0.g(audioProfileA.getChannelMasks()));
                        } else {
                            map.put(numValueOf, new HashSet(AbstractC5305tw0.g(audioProfileA.getChannelMasks())));
                        }
                    }
                }
            }
            int i12 = AbstractC5931yu0.f35482c;
            C5553vu0 c5553vu0 = new C5553vu0();
            for (Map.Entry entry : map.entrySet()) {
                c5553vu0.g(new C4999rV0(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
            }
            return new AV0(c5553vu0.j());
        }
        AudioDeviceInfo[] devices = audioDeviceInfo == null ? audioManagerA.getDevices(2) : new AudioDeviceInfo[]{audioDeviceInfo};
        C1851Hu0 c1851Hu0 = new C1851Hu0();
        c1851Hu0.h(8, 7);
        if (i10 >= 31) {
            c1851Hu0.h(26, 27);
        }
        if (i10 >= 33) {
            c1851Hu0.g(30);
        }
        AbstractC1903Iu0 abstractC1903Iu0J = c1851Hu0.j();
        for (AudioDeviceInfo audioDeviceInfo2 : devices) {
            if (abstractC1903Iu0J.contains(Integer.valueOf(audioDeviceInfo2.getType()))) {
                return f17344c;
            }
        }
        C1851Hu0 c1851Hu1 = new C1851Hu0();
        c1851Hu1.g(2);
        if (Build.VERSION.SDK_INT >= 29 && (AbstractC4634ob0.m(context) || AbstractC4634ob0.n(context))) {
            int i13 = AbstractC5931yu0.f35482c;
            C5553vu0 c5553vu1 = new C5553vu0();
            AbstractC2112Mv0 abstractC2112Mv0A = f17346e.keySet().a();
            while (abstractC2112Mv0A.hasNext()) {
                Integer num = (Integer) abstractC2112Mv0A.next();
                int iIntValue = num.intValue();
                if (Build.VERSION.SDK_INT >= AbstractC4634ob0.c(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), c4966rF.a())) {
                    c5553vu1.g(num);
                }
            }
            c5553vu1.g(2);
            c1851Hu1.i(c5553vu1.j());
            return new AV0(f(AbstractC5305tw0.f(c1851Hu1.j()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z9 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z9 || e()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            c1851Hu1.i(f17345d);
        }
        if (intent == null || z9 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new AV0(f(AbstractC5305tw0.f(c1851Hu1.j()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            c1851Hu1.i(AbstractC5305tw0.g(intArrayExtra));
        }
        return new AV0(f(AbstractC5305tw0.f(c1851Hu1.j()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    static Uri c() {
        if (e()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    private static boolean e() {
        String str = Build.MANUFACTURER;
        return str.equals("Amazon") || str.equals("Xiaomi");
    }

    private static AbstractC5931yu0 f(int[] iArr, int i10) {
        int i11 = AbstractC5931yu0.f35482c;
        C5553vu0 c5553vu0 = new C5553vu0();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i12 : iArr) {
            c5553vu0.g(new C4999rV0(i12, i10));
        }
        return c5553vu0.j();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x003a A[PHI: r1
      0x003a: PHI (r1v3 int) = (r1v2 int), (r1v7 int) binds: [B:11:0x002c, B:14:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x003e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0099  */
    public final Pair d(JY0 jy0, C4966rF c4966rF) {
        String str = jy0.f19929o;
        str.getClass();
        int iG = A8.g(str, jy0.f19925k);
        if (!f17346e.containsKey(Integer.valueOf(iG))) {
            return null;
        }
        int i10 = 8;
        if (iG != 18) {
            if (iG != 8) {
                if (iG == 30 && !AbstractC4634ob0.w(this.f17347a, 30)) {
                    iG = 7;
                }
            } else if (AbstractC4634ob0.w(this.f17347a, 8)) {
                iG = 8;
                if (iG == 30) {
                    iG = 7;
                }
            } else {
                iG = 7;
            }
        } else if (AbstractC4634ob0.w(this.f17347a, 18)) {
            iG = 18;
            if (iG != 8) {
                if (iG == 30) {
                    iG = 7;
                }
            } else if (AbstractC4634ob0.w(this.f17347a, 8)) {
                iG = 8;
                if (iG == 30) {
                    iG = 7;
                }
            } else {
                iG = 7;
            }
        } else {
            iG = 6;
        }
        SparseArray sparseArray = this.f17347a;
        if (!AbstractC4634ob0.w(sparseArray, iG)) {
            return null;
        }
        C4999rV0 c4999rV0 = (C4999rV0) sparseArray.get(iG);
        c4999rV0.getClass();
        int iB = jy0.f19906G;
        if (iB == -1 || iG == 18) {
            int i11 = jy0.f19907H;
            if (i11 == -1) {
                i11 = 48000;
            }
            iB = c4999rV0.b(i11, c4966rF);
        } else if (!str.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
            if (!c4999rV0.a(iB)) {
                return null;
            }
        } else if (iB > 10) {
            return null;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 > 28) {
            i10 = iB;
        } else if (iB != 7) {
            if (iB == 3 || iB == 4 || iB == 5) {
                i10 = 6;
            } else {
                i10 = iB;
            }
        }
        if (i12 <= 26 && "fugu".equals(Build.DEVICE) && i10 == 1) {
            i10 = 2;
        }
        int iB2 = AbstractC4634ob0.b(i10);
        if (iB2 != 0) {
            return Pair.create(Integer.valueOf(iG), Integer.valueOf(iB2));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0047 A[RETURN] */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AV0)) {
            return false;
        }
        AV0 av0 = (AV0) obj;
        SparseArray sparseArray = this.f17347a;
        SparseArray sparseArray2 = av0.f17347a;
        String str = AbstractC4634ob0.f32117a;
        if (Build.VERSION.SDK_INT < 31) {
            int size = sparseArray.size();
            if (size == sparseArray2.size()) {
                for (int i10 = 0; i10 < size; i10++) {
                    if (Objects.equals(sparseArray.valueAt(i10), sparseArray2.get(sparseArray.keyAt(i10)))) {
                    }
                }
                if (this.f17348b == av0.f17348b) {
                    return true;
                }
            }
        } else if (sparseArray.contentEquals(sparseArray2)) {
            if (this.f17348b == av0.f17348b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iContentHashCode;
        String str = AbstractC4634ob0.f32117a;
        int i10 = Build.VERSION.SDK_INT;
        SparseArray sparseArray = this.f17347a;
        if (i10 >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iKeyAt = 17;
            for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                iKeyAt = (((iKeyAt * 31) + sparseArray.keyAt(i11)) * 31) + Objects.hashCode(sparseArray.valueAt(i11));
            }
            iContentHashCode = iKeyAt;
        }
        return this.f17348b + (iContentHashCode * 31);
    }

    public final String toString() {
        String string = this.f17347a.toString();
        int i10 = this.f17348b;
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 50 + string.length() + 1);
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(i10);
        sb.append(", audioProfiles=");
        sb.append(string);
        sb.append("]");
        return sb.toString();
    }
}

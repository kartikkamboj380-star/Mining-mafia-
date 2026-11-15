package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.protobuf.CodedOutputStream;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4255lb extends UL0 implements InterfaceC5989zM0 {
    private static final C4255lb zzbl;
    private static volatile FM0 zzbm;
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private long zzH;
    private long zzI;
    private long zzJ;
    private long zzL;
    private C4507nb zzO;
    private int zza;
    private C3627gb zzaF;
    private C3250db zzaG;
    private long zzaM;
    private long zzaN;
    private long zzaQ;
    private C2485Ua zzaR;
    private C2589Wa zzaS;
    private int zzaV;
    private C3879ib zzag;
    private C4129kb zzai;
    private int zzat;
    private int zzau;
    private int zzav;
    private int zzaw;
    private C1448Ab zzax;
    private int zzb;
    private int zzba;
    private C2381Sa zzbb;
    private long zzbc;
    private boolean zzbf;
    private long zzbh;
    private C5892yb zzbi;
    private int zzc;
    private int zzd;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;
    private String zze = "";
    private String zzf = "";
    private String zzu = "";
    private String zzE = "";
    private String zzF = "D";
    private String zzG = "";
    private String zzK = "";
    private long zzM = -1;
    private long zzN = -1;
    private long zzP = -1;
    private long zzQ = -1;
    private long zzR = -1;
    private long zzS = -1;
    private long zzT = -1;
    private long zzU = -1;
    private String zzV = "D";
    private String zzW = "D";
    private long zzX = -1;
    private int zzY = 1000;
    private int zzZ = 1000;
    private long zzaa = -1;
    private long zzab = -1;
    private long zzac = -1;
    private long zzad = -1;
    private long zzae = -1;
    private int zzaf = 1000;
    private InterfaceC3221dM0 zzah = UL0.x();
    private long zzaj = -1;
    private long zzak = -1;
    private long zzal = -1;
    private long zzam = -1;
    private long zzan = -1;
    private long zzao = -1;
    private long zzap = -1;
    private long zzaq = -1;
    private String zzar = "D";
    private long zzas = -1;
    private long zzay = -1;
    private int zzaz = 1000;
    private int zzaA = 1000;
    private String zzaB = "D";
    private InterfaceC3221dM0 zzaC = UL0.x();
    private int zzaD = 1000;
    private InterfaceC3221dM0 zzaE = UL0.x();
    private String zzaH = "";
    private long zzaI = -1;
    private long zzaJ = -1;
    private long zzaK = -1;
    private long zzaL = -1;
    private long zzaO = -1;
    private String zzaP = "";
    private long zzaT = -1;
    private long zzaU = -1;
    private String zzaW = "";
    private String zzaX = "";
    private long zzaY = -1;
    private long zzaZ = -1;
    private String zzbd = "";
    private int zzbe = 2;
    private String zzbg = "";
    private long zzbj = -1;
    private String zzbk = "";

    static {
        C4255lb c4255lb = new C4255lb();
        zzbl = c4255lb;
        UL0.U(C4255lb.class, c4255lb);
    }

    private C4255lb() {
    }

    public static C4255lb f1(byte[] bArr, HL0 hl0) {
        return (C4255lb) UL0.D(zzbl, bArr, hl0);
    }

    public static C1966Ka g1() {
        return (C1966Ka) zzbl.P();
    }

    public static C4255lb h1() {
        return zzbl;
    }

    final /* synthetic */ void A0(long j10) {
        this.zzb |= 1048576;
        this.zzaj = j10;
    }

    final /* synthetic */ void B0(long j10) {
        this.zzb |= 2097152;
        this.zzak = j10;
    }

    final /* synthetic */ void C0(long j10) {
        this.zzb |= 4194304;
        this.zzal = j10;
    }

    public final boolean D0() {
        return (this.zza & 4194304) != 0;
    }

    final /* synthetic */ void E0(long j10) {
        this.zzb |= 8388608;
        this.zzam = j10;
    }

    final /* synthetic */ void F0(long j10) {
        this.zzb |= 16777216;
        this.zzan = j10;
    }

    final /* synthetic */ void G0(long j10) {
        this.zzb |= 67108864;
        this.zzap = j10;
    }

    final /* synthetic */ void H0(long j10) {
        this.zzb |= 134217728;
        this.zzaq = j10;
    }

    final /* synthetic */ void I0(String str) {
        str.getClass();
        this.zzb |= 268435456;
        this.zzar = str;
    }

    final /* synthetic */ void J0(String str) {
        str.getClass();
        this.zzc |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        this.zzaH = str;
    }

    final /* synthetic */ void K0(long j10) {
        this.zzc |= 2048;
        this.zzaI = j10;
    }

    final /* synthetic */ void L0(long j10) {
        this.zzc |= CodedOutputStream.DEFAULT_BUFFER_SIZE;
        this.zzaJ = j10;
    }

    final /* synthetic */ void M0(long j10) {
        this.zzc |= 8192;
        this.zzaK = j10;
    }

    final /* synthetic */ void N0(long j10) {
        this.zzc |= 16384;
        this.zzaL = j10;
    }

    final /* synthetic */ void O0(String str) {
        str.getClass();
        this.zzc |= 262144;
        this.zzaP = str;
    }

    final /* synthetic */ void P0(long j10) {
        this.zzc |= 8388608;
        this.zzaU = j10;
    }

    final /* synthetic */ void Q0(long j10) {
        this.zzd |= 16;
        this.zzbh = j10;
    }

    final /* synthetic */ void R0(C5892yb c5892yb) {
        c5892yb.getClass();
        this.zzbi = c5892yb;
        this.zzd |= 32;
    }

    final /* synthetic */ void T0(int i10) {
        this.zzY = i10 - 1;
        this.zzb |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
    }

    final /* synthetic */ void U0(int i10) {
        this.zzZ = i10 - 1;
        this.zzb |= 2048;
    }

    final /* synthetic */ void V0(int i10) {
        this.zzaf = i10 - 1;
        this.zzb |= 131072;
    }

    final /* synthetic */ void W0(int i10) {
        this.zzaz = i10 - 1;
        this.zzc |= 16;
    }

    final /* synthetic */ void X0(int i10) {
        this.zzaA = i10 - 1;
        this.zzc |= 32;
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            YL0 yl0 = C2173Oa.f21597a;
            YL0 yl1 = C5262tb.f33428a;
            return UL0.V(zzbl, "\u0001k\u0000\u0004\u0001Įk\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ_\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈ`\u0019ဂd\u001a᠌a\u001bဈ\u0016\u001cဇb\u001dဈ\u0018\u001eဈc\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0᠌*1᠌+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08᠌19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=A᠌>B᠌?Cဈ<D᠌AEဉBFဂCGဂ8Hဂ9I᠌DJဂ)Kဈ\u0017L᠌EMဈFN\u001bO᠌GP\u001bQဉHRဈJSဂKTဂLUဂMVဂNWဂOXဂQYဈRZဉT[ဉU\\ဂV]ဂW^᠌X_᠌@`ဉIaဂPbဈYcဈZdဂ[eဂ\\f᠌]gဂShဉ^ÉဉeĭဂfĮဈg", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzbc", "zzC", "zzD", "zzbd", "zzbh", "zzbe", yl0, "zzE", "zzbf", "zzG", "zzbg", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzah", C3879ib.class, "zzT", "zzU", "zzV", "zzW", "zzY", yl1, "zzZ", yl1, "zzag", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", yl1, "zzai", "zzaj", "zzak", "zzal", "zzam", "zzap", "zzaq", "zzas", "zzat", C5136sb.f33191a, "zzau", C5640wb.f34600a, "zzar", "zzaw", C2018La.f20553a, "zzax", "zzay", "zzan", "zzao", "zzaz", yl1, "zzX", "zzF", "zzaA", yl1, "zzaB", "zzaC", C2999bb.class, "zzaD", yl1, "zzaE", C2121Na.class, "zzaF", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaL", "zzaM", "zzaO", "zzaP", "zzaR", "zzaS", "zzaT", "zzaU", "zzaV", C2641Xa.f25312a, "zzav", C2225Pa.f22131a, "zzaG", "zzaN", "zzaW", "zzaX", "zzaY", "zzaZ", "zzba", C2745Za.f26241a, "zzaQ", "zzbb", "zzbi", "zzbj", "zzbk"});
        }
        if (iOrdinal == 3) {
            return new C4255lb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C1966Ka(bArr);
        }
        if (iOrdinal == 5) {
            return zzbl;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        FM0 fm0 = zzbm;
        if (fm0 != null) {
            return fm0;
        }
        synchronized (C4255lb.class) {
            try {
                rl0 = zzbm;
                if (rl0 == null) {
                    rl0 = new RL0(zzbl);
                    zzbm = rl0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rl0;
    }

    final /* synthetic */ void Y0(int i10) {
        this.zzaV = i10 - 1;
        this.zzc |= 16777216;
    }

    public final String Z0() {
        return this.zzE;
    }

    public final boolean a1() {
        return (this.zzb & 1048576) != 0;
    }

    public final long b1() {
        return this.zzaj;
    }

    public final long c1() {
        return this.zzan;
    }

    final /* synthetic */ void d0(String str) {
        str.getClass();
        this.zza |= 16777216;
        this.zzG = str;
    }

    public final boolean d1() {
        return (this.zzd & 32) != 0;
    }

    final /* synthetic */ void e0(long j10) {
        this.zza |= 33554432;
        this.zzH = j10;
    }

    public final C5892yb e1() {
        C5892yb c5892yb = this.zzbi;
        return c5892yb == null ? C5892yb.h0() : c5892yb;
    }

    final /* synthetic */ void f0(long j10) {
        this.zza |= 67108864;
        this.zzI = j10;
    }

    final /* synthetic */ void g0(long j10) {
        this.zza |= 134217728;
        this.zzJ = j10;
    }

    final /* synthetic */ void h0(String str) {
        str.getClass();
        this.zza |= 268435456;
        this.zzK = str;
    }

    final /* synthetic */ void i0(long j10) {
        this.zza |= 536870912;
        this.zzL = j10;
    }

    final /* synthetic */ void i1(String str) {
        str.getClass();
        this.zza |= 1;
        this.zze = str;
    }

    final /* synthetic */ void j0(long j10) {
        this.zza |= 1073741824;
        this.zzM = j10;
    }

    final /* synthetic */ void j1(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzf = str;
    }

    final /* synthetic */ void k0(long j10) {
        this.zza |= LinearLayoutManager.INVALID_OFFSET;
        this.zzN = j10;
    }

    final /* synthetic */ void k1(long j10) {
        this.zza |= 4;
        this.zzg = j10;
    }

    final /* synthetic */ void l0(long j10) {
        this.zzb |= 2;
        this.zzP = j10;
    }

    final /* synthetic */ void l1(long j10) {
        this.zza |= 16;
        this.zzi = j10;
    }

    final /* synthetic */ void m0(long j10) {
        this.zzb |= 4;
        this.zzQ = j10;
    }

    final /* synthetic */ void m1(long j10) {
        this.zza |= 32;
        this.zzj = j10;
    }

    final /* synthetic */ void n0(long j10) {
        this.zzb |= 8;
        this.zzR = j10;
    }

    final /* synthetic */ void n1(long j10) {
        this.zza |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        this.zzo = j10;
    }

    final /* synthetic */ void o0(long j10) {
        this.zzb |= 16;
        this.zzS = j10;
    }

    final /* synthetic */ void o1(long j10) {
        this.zza |= 2048;
        this.zzp = j10;
    }

    final /* synthetic */ void p0(long j10) {
        this.zzb |= 32;
        this.zzT = j10;
    }

    final /* synthetic */ void p1(long j10) {
        this.zza |= 8192;
        this.zzv = j10;
    }

    final /* synthetic */ void q0(long j10) {
        this.zzb |= 64;
        this.zzU = j10;
    }

    final /* synthetic */ void q1(long j10) {
        this.zza |= 16384;
        this.zzw = j10;
    }

    final /* synthetic */ void r0(String str) {
        str.getClass();
        this.zzb |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        this.zzV = str;
    }

    final /* synthetic */ void r1(long j10) {
        this.zza |= 32768;
        this.zzx = j10;
    }

    final /* synthetic */ void s0(String str) {
        str.getClass();
        this.zzb |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
        this.zzW = str;
    }

    final /* synthetic */ void s1(long j10) {
        this.zza |= 65536;
        this.zzy = j10;
    }

    final /* synthetic */ void t0(long j10) {
        this.zzb |= CodedOutputStream.DEFAULT_BUFFER_SIZE;
        this.zzaa = j10;
    }

    final /* synthetic */ void t1(long j10) {
        this.zza |= 524288;
        this.zzB = j10;
    }

    final /* synthetic */ void u0(long j10) {
        this.zzb |= 8192;
        this.zzab = j10;
    }

    final /* synthetic */ void u1(long j10) {
        this.zza |= 1048576;
        this.zzC = j10;
    }

    final /* synthetic */ void v0(long j10) {
        this.zzb |= 16384;
        this.zzac = j10;
    }

    final /* synthetic */ void v1(long j10) {
        this.zza |= 2097152;
        this.zzD = j10;
    }

    final /* synthetic */ void w0(C3879ib c3879ib) {
        c3879ib.getClass();
        this.zzag = c3879ib;
        this.zzb |= 262144;
    }

    final /* synthetic */ void w1(String str) {
        str.getClass();
        this.zza |= 4194304;
        this.zzE = str;
    }

    final /* synthetic */ void x0(C3879ib c3879ib) {
        c3879ib.getClass();
        InterfaceC3221dM0 interfaceC3221dM0 = this.zzah;
        if (!interfaceC3221dM0.zza()) {
            this.zzah = UL0.y(interfaceC3221dM0);
        }
        this.zzah.add(c3879ib);
    }

    final /* synthetic */ void y0() {
        this.zzah = UL0.x();
    }

    final /* synthetic */ void z0(C4129kb c4129kb) {
        c4129kb.getClass();
        this.zzai = c4129kb;
        this.zzb |= 524288;
    }
}

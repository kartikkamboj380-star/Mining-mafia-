package p240y;

import java.util.ArrayList;
import p230x.d;

/* JADX INFO: loaded from: classes.dex */
public class g extends l {

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private e[] f50728i1;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    private int f50705L0 = -1;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    private int f50706M0 = -1;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    private int f50707N0 = -1;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    private int f50708O0 = -1;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    private int f50709P0 = -1;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    private int f50710Q0 = -1;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    private float f50711R0 = 0.5f;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    private float f50712S0 = 0.5f;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    private float f50713T0 = 0.5f;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    private float f50714U0 = 0.5f;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    private float f50715V0 = 0.5f;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    private float f50716W0 = 0.5f;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    private int f50717X0 = 0;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    private int f50718Y0 = 0;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    private int f50719Z0 = 2;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private int f50720a1 = 2;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private int f50721b1 = 0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private int f50722c1 = -1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private int f50723d1 = 0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private ArrayList f50724e1 = new ArrayList();

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private e[] f50725f1 = null;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private e[] f50726g1 = null;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private int[] f50727h1 = null;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    private int f50729j1 = 0;

    private class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f50730a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private d f50733d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d f50734e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private d f50735f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private d f50736g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f50737h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f50738i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f50739j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f50740k;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f50746q;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private e f50731b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f50732c = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f50741l = 0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f50742m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f50743n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f50744o = 0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f50745p = 0;

        public a(int i10, d dVar, d dVar2, d dVar3, d dVar4, int i11) {
            this.f50737h = 0;
            this.f50738i = 0;
            this.f50739j = 0;
            this.f50740k = 0;
            this.f50746q = 0;
            this.f50730a = i10;
            this.f50733d = dVar;
            this.f50734e = dVar2;
            this.f50735f = dVar3;
            this.f50736g = dVar4;
            this.f50737h = g.this.P0();
            this.f50738i = g.this.R0();
            this.f50739j = g.this.Q0();
            this.f50740k = g.this.O0();
            this.f50746q = i11;
        }

        private void h() {
            this.f50741l = 0;
            this.f50742m = 0;
            this.f50731b = null;
            this.f50732c = 0;
            int i10 = this.f50744o;
            for (int i11 = 0; i11 < i10 && this.f50743n + i11 < g.this.f50729j1; i11++) {
                e eVar = g.this.f50728i1[this.f50743n + i11];
                if (this.f50730a == 0) {
                    int iP = eVar.P();
                    int i12 = g.this.f50717X0;
                    if (eVar.O() == 8) {
                        i12 = 0;
                    }
                    this.f50741l += iP + i12;
                    int iA1 = g.this.A1(eVar, this.f50746q);
                    if (this.f50731b == null || this.f50732c < iA1) {
                        this.f50731b = eVar;
                        this.f50732c = iA1;
                        this.f50742m = iA1;
                    }
                } else {
                    int iB1 = g.this.B1(eVar, this.f50746q);
                    int iA2 = g.this.A1(eVar, this.f50746q);
                    int i13 = g.this.f50718Y0;
                    if (eVar.O() == 8) {
                        i13 = 0;
                    }
                    this.f50742m += iA2 + i13;
                    if (this.f50731b == null || this.f50732c < iB1) {
                        this.f50731b = eVar;
                        this.f50732c = iB1;
                        this.f50741l = iB1;
                    }
                }
            }
        }

        public void b(e eVar) {
            if (this.f50730a == 0) {
                int iB1 = g.this.B1(eVar, this.f50746q);
                if (eVar.y() == e.b.MATCH_CONSTRAINT) {
                    this.f50745p++;
                    iB1 = 0;
                }
                this.f50741l += iB1 + (eVar.O() != 8 ? g.this.f50717X0 : 0);
                int iA1 = g.this.A1(eVar, this.f50746q);
                if (this.f50731b == null || this.f50732c < iA1) {
                    this.f50731b = eVar;
                    this.f50732c = iA1;
                    this.f50742m = iA1;
                }
            } else {
                int iB2 = g.this.B1(eVar, this.f50746q);
                int iA2 = g.this.A1(eVar, this.f50746q);
                if (eVar.M() == e.b.MATCH_CONSTRAINT) {
                    this.f50745p++;
                    iA2 = 0;
                }
                this.f50742m += iA2 + (eVar.O() != 8 ? g.this.f50718Y0 : 0);
                if (this.f50731b == null || this.f50732c < iB2) {
                    this.f50731b = eVar;
                    this.f50732c = iB2;
                    this.f50741l = iB2;
                }
            }
            this.f50744o++;
        }

        public void c() {
            this.f50732c = 0;
            this.f50731b = null;
            this.f50741l = 0;
            this.f50742m = 0;
            this.f50743n = 0;
            this.f50744o = 0;
            this.f50745p = 0;
        }

        public void d(boolean z9, int i10, boolean z10) {
            e eVar;
            int i11;
            char c10;
            int i12 = this.f50744o;
            for (int i13 = 0; i13 < i12 && this.f50743n + i13 < g.this.f50729j1; i13++) {
                e eVar2 = g.this.f50728i1[this.f50743n + i13];
                if (eVar2 != null) {
                    eVar2.Z();
                }
            }
            if (i12 == 0 || this.f50731b == null) {
                return;
            }
            boolean z11 = z10 && i10 == 0;
            int i14 = -1;
            int i15 = -1;
            for (int i16 = 0; i16 < i12; i16++) {
                int i17 = z9 ? (i12 - 1) - i16 : i16;
                if (this.f50743n + i17 >= g.this.f50729j1) {
                    break;
                }
                if (g.this.f50728i1[this.f50743n + i17].O() == 0) {
                    if (i14 == -1) {
                        i14 = i16;
                    }
                    i15 = i16;
                }
            }
            e eVar3 = null;
            if (this.f50730a != 0) {
                e eVar4 = this.f50731b;
                eVar4.j0(g.this.f50705L0);
                int i18 = this.f50737h;
                if (i10 > 0) {
                    i18 += g.this.f50717X0;
                }
                if (z9) {
                    eVar4.f50605D.a(this.f50735f, i18);
                    if (z10) {
                        eVar4.f50603B.a(this.f50733d, this.f50739j);
                    }
                    if (i10 > 0) {
                        this.f50735f.f50584b.f50603B.a(eVar4.f50605D, 0);
                    }
                } else {
                    eVar4.f50603B.a(this.f50733d, i18);
                    if (z10) {
                        eVar4.f50605D.a(this.f50735f, this.f50739j);
                    }
                    if (i10 > 0) {
                        this.f50733d.f50584b.f50605D.a(eVar4.f50603B, 0);
                    }
                }
                int i19 = 0;
                while (i19 < i12 && this.f50743n + i19 < g.this.f50729j1) {
                    e eVar5 = g.this.f50728i1[this.f50743n + i19];
                    if (i19 == 0) {
                        eVar5.j(eVar5.f50604C, this.f50734e, this.f50738i);
                        int i20 = g.this.f50706M0;
                        float f10 = g.this.f50712S0;
                        if (this.f50743n == 0 && g.this.f50708O0 != -1) {
                            i20 = g.this.f50708O0;
                            f10 = g.this.f50714U0;
                        } else if (z10 && g.this.f50710Q0 != -1) {
                            i20 = g.this.f50710Q0;
                            f10 = g.this.f50716W0;
                        }
                        eVar5.y0(i20);
                        eVar5.x0(f10);
                    }
                    if (i19 == i12 - 1) {
                        eVar5.j(eVar5.f50606E, this.f50736g, this.f50740k);
                    }
                    if (eVar3 != null) {
                        eVar5.f50604C.a(eVar3.f50606E, g.this.f50718Y0);
                        if (i19 == i14) {
                            eVar5.f50604C.n(this.f50738i);
                        }
                        eVar3.f50606E.a(eVar5.f50604C, 0);
                        if (i19 == i15 + 1) {
                            eVar3.f50606E.n(this.f50740k);
                        }
                    }
                    if (eVar5 != eVar4) {
                        if (z9) {
                            int i21 = g.this.f50719Z0;
                            if (i21 == 0) {
                                eVar5.f50605D.a(eVar4.f50605D, 0);
                            } else if (i21 == 1) {
                                eVar5.f50603B.a(eVar4.f50603B, 0);
                            } else if (i21 == 2) {
                                eVar5.f50603B.a(eVar4.f50603B, 0);
                                eVar5.f50605D.a(eVar4.f50605D, 0);
                            }
                        } else {
                            int i22 = g.this.f50719Z0;
                            if (i22 == 0) {
                                eVar5.f50603B.a(eVar4.f50603B, 0);
                            } else if (i22 == 1) {
                                eVar5.f50605D.a(eVar4.f50605D, 0);
                            } else if (i22 == 2) {
                                if (z11) {
                                    eVar5.f50603B.a(this.f50733d, this.f50737h);
                                    eVar5.f50605D.a(this.f50735f, this.f50739j);
                                } else {
                                    eVar5.f50603B.a(eVar4.f50603B, 0);
                                    eVar5.f50605D.a(eVar4.f50605D, 0);
                                }
                            }
                        }
                    }
                    i19++;
                    eVar3 = eVar5;
                }
                return;
            }
            e eVar6 = this.f50731b;
            eVar6.y0(g.this.f50706M0);
            int i23 = this.f50738i;
            if (i10 > 0) {
                i23 += g.this.f50718Y0;
            }
            eVar6.f50604C.a(this.f50734e, i23);
            if (z10) {
                eVar6.f50606E.a(this.f50736g, this.f50740k);
            }
            if (i10 > 0) {
                this.f50734e.f50584b.f50606E.a(eVar6.f50604C, 0);
            }
            if (g.this.f50720a1 != 3 || eVar6.S()) {
                eVar = eVar6;
                break;
            }
            int i24 = 0;
            while (true) {
                if (i24 < i12) {
                    int i25 = z9 ? (i12 - 1) - i24 : i24;
                    if (this.f50743n + i25 < g.this.f50729j1) {
                        eVar = g.this.f50728i1[this.f50743n + i25];
                        if (eVar.S()) {
                            break;
                        } else {
                            i24++;
                        }
                    }
                }
                eVar = eVar6;
                break;
            }
            int i26 = 0;
            while (i26 < i12) {
                int i27 = z9 ? (i12 - 1) - i26 : i26;
                if (this.f50743n + i27 >= g.this.f50729j1) {
                    return;
                }
                e eVar7 = g.this.f50728i1[this.f50743n + i27];
                if (i26 == 0) {
                    i11 = 1;
                    eVar7.j(eVar7.f50603B, this.f50733d, this.f50737h);
                } else {
                    i11 = 1;
                }
                if (i27 == 0) {
                    int i28 = g.this.f50705L0;
                    float f11 = g.this.f50711R0;
                    if (this.f50743n == 0 && g.this.f50707N0 != -1) {
                        i28 = g.this.f50707N0;
                        f11 = g.this.f50713T0;
                    } else if (z10 && g.this.f50709P0 != -1) {
                        i28 = g.this.f50709P0;
                        f11 = g.this.f50715V0;
                    }
                    eVar7.j0(i28);
                    eVar7.i0(f11);
                }
                if (i26 == i12 - 1) {
                    eVar7.j(eVar7.f50605D, this.f50735f, this.f50739j);
                }
                if (eVar3 != null) {
                    eVar7.f50603B.a(eVar3.f50605D, g.this.f50717X0);
                    if (i26 == i14) {
                        eVar7.f50603B.n(this.f50737h);
                    }
                    eVar3.f50605D.a(eVar7.f50603B, 0);
                    if (i26 == i15 + 1) {
                        eVar3.f50605D.n(this.f50739j);
                    }
                }
                if (eVar7 != eVar6) {
                    c10 = 3;
                    if (g.this.f50720a1 == 3 && eVar.S() && eVar7 != eVar && eVar7.S()) {
                        eVar7.f50607F.a(eVar.f50607F, 0);
                    } else {
                        int i29 = g.this.f50720a1;
                        if (i29 == 0) {
                            eVar7.f50604C.a(eVar6.f50604C, 0);
                        } else if (i29 == i11) {
                            eVar7.f50606E.a(eVar6.f50606E, 0);
                        } else if (z11) {
                            eVar7.f50604C.a(this.f50734e, this.f50738i);
                            eVar7.f50606E.a(this.f50736g, this.f50740k);
                        } else {
                            eVar7.f50604C.a(eVar6.f50604C, 0);
                            eVar7.f50606E.a(eVar6.f50606E, 0);
                        }
                    }
                } else {
                    c10 = 3;
                }
                i26++;
                eVar3 = eVar7;
            }
        }

        public int e() {
            return this.f50730a == 1 ? this.f50742m - g.this.f50718Y0 : this.f50742m;
        }

        public int f() {
            return this.f50730a == 0 ? this.f50741l - g.this.f50717X0 : this.f50741l;
        }

        public void g(int i10) {
            int i11 = this.f50745p;
            if (i11 == 0) {
                return;
            }
            int i12 = this.f50744o;
            int i13 = i10 / i11;
            for (int i14 = 0; i14 < i12 && this.f50743n + i14 < g.this.f50729j1; i14++) {
                e eVar = g.this.f50728i1[this.f50743n + i14];
                if (this.f50730a == 0) {
                    if (eVar != null && eVar.y() == e.b.MATCH_CONSTRAINT && eVar.f50650l == 0) {
                        g.this.T0(eVar, e.b.FIXED, i13, eVar.M(), eVar.v());
                    }
                } else if (eVar != null && eVar.M() == e.b.MATCH_CONSTRAINT && eVar.f50652m == 0) {
                    int i15 = i13;
                    g.this.T0(eVar, eVar.y(), eVar.P(), e.b.FIXED, i15);
                    i13 = i15;
                }
            }
            h();
        }

        public void i(int i10) {
            this.f50743n = i10;
        }

        public void j(int i10, d dVar, d dVar2, d dVar3, d dVar4, int i11, int i12, int i13, int i14, int i15) {
            this.f50730a = i10;
            this.f50733d = dVar;
            this.f50734e = dVar2;
            this.f50735f = dVar3;
            this.f50736g = dVar4;
            this.f50737h = i11;
            this.f50738i = i12;
            this.f50739j = i13;
            this.f50740k = i14;
            this.f50746q = i15;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int A1(e eVar, int i10) {
        e eVar2;
        if (eVar == null) {
            return 0;
        }
        if (eVar.M() == e.b.MATCH_CONSTRAINT) {
            int i11 = eVar.f50652m;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (eVar.f50666t * i10);
                if (i12 != eVar.v()) {
                    T0(eVar, eVar.y(), eVar.P(), e.b.FIXED, i12);
                }
                return i12;
            }
            eVar2 = eVar;
            if (i11 == 1) {
                return eVar2.v();
            }
            if (i11 == 3) {
                return (int) ((eVar2.P() * eVar2.f50618Q) + 0.5f);
            }
        } else {
            eVar2 = eVar;
        }
        return eVar2.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int B1(e eVar, int i10) {
        e eVar2;
        if (eVar == null) {
            return 0;
        }
        if (eVar.y() == e.b.MATCH_CONSTRAINT) {
            int i11 = eVar.f50650l;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (eVar.f50660q * i10);
                if (i12 != eVar.P()) {
                    T0(eVar, e.b.FIXED, i12, eVar.M(), eVar.v());
                }
                return i12;
            }
            eVar2 = eVar;
            if (i11 == 1) {
                return eVar2.P();
            }
            if (i11 == 3) {
                return (int) ((eVar2.v() * eVar2.f50618Q) + 0.5f);
            }
        } else {
            eVar2 = eVar;
        }
        return eVar2.P();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:106:0x010f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:109:0x0117 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0059 A[ADDED_TO_REGION, EDGE_INSN: B:119:0x0059->B:42:0x0059 BREAK  A[LOOP:1: B:44:0x005c->B:124:0x005c], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0059 A[ADDED_TO_REGION, EDGE_INSN: B:122:0x0059->B:42:0x0059 BREAK  A[LOOP:1: B:44:0x005c->B:124:0x005c], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x00d3 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0060  */
    /* JADX WARN: Code duplicated, block: B:47:0x006a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0078  */
    /* JADX WARN: Code duplicated, block: B:54:0x0080  */
    /* JADX WARN: Code duplicated, block: B:57:0x0088  */
    /* JADX WARN: Code duplicated, block: B:61:0x0090  */
    /* JADX WARN: Code duplicated, block: B:64:0x0097  */
    /* JADX WARN: Code duplicated, block: B:66:0x009a  */
    /* JADX WARN: Code duplicated, block: B:68:0x009f  */
    /* JADX WARN: Code duplicated, block: B:72:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:82:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:89:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:91:0x00e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:97:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:99:0x00fa A[DONT_INVERT] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x010d -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x010f -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0115 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0117 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:45:0x005e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private void C1(p240y.e[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p240y.g.C1(y.e[], int, int, int, int[]):void");
    }

    private void D1(e[] eVarArr, int i10, int i11, int i12, int[] iArr) {
        int i13;
        g gVar;
        int i14;
        d dVar;
        int i15;
        g gVar2 = this;
        if (i10 == 0) {
            return;
        }
        gVar2.f50724e1.clear();
        int i16 = i12;
        a aVar = gVar2.new a(i11, gVar2.f50603B, gVar2.f50604C, gVar2.f50605D, gVar2.f50606E, i16);
        gVar2.f50724e1.add(aVar);
        if (i11 == 0) {
            i13 = 0;
            int i17 = 0;
            int i18 = 0;
            while (i18 < i10) {
                e eVar = eVarArr[i18];
                int iB1 = gVar2.B1(eVar, i16);
                if (eVar.y() == e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i19 = i13;
                boolean z9 = (i17 == i16 || (gVar2.f50717X0 + i17) + iB1 > i16) && aVar.f50731b != null;
                if (!z9 && i18 > 0 && (i15 = gVar2.f50722c1) > 0 && i18 % i15 == 0) {
                    z9 = true;
                }
                if (z9) {
                    aVar = gVar2.new a(i11, gVar2.f50603B, gVar2.f50604C, gVar2.f50605D, gVar2.f50606E, i16);
                    aVar.i(i18);
                    gVar2.f50724e1.add(aVar);
                } else {
                    if (i18 > 0) {
                        i17 += gVar2.f50717X0 + iB1;
                    }
                    aVar.b(eVar);
                    i18++;
                    i13 = i19;
                }
                i17 = iB1;
                aVar.b(eVar);
                i18++;
                i13 = i19;
            }
        } else {
            i13 = 0;
            int i20 = 0;
            int i21 = 0;
            while (i21 < i10) {
                e eVar2 = eVarArr[i21];
                int iA1 = gVar2.A1(eVar2, i16);
                if (eVar2.M() == e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i22 = i13;
                boolean z10 = (i20 == i16 || (gVar2.f50718Y0 + i20) + iA1 > i16) && aVar.f50731b != null;
                if (!z10 && i21 > 0 && (i14 = gVar2.f50722c1) > 0 && i21 % i14 == 0) {
                    z10 = true;
                }
                if (z10) {
                    aVar = gVar2.new a(i11, gVar2.f50603B, gVar2.f50604C, gVar2.f50605D, gVar2.f50606E, i16);
                    gVar = gVar2;
                    aVar.i(i21);
                    gVar.f50724e1.add(aVar);
                } else {
                    gVar = gVar2;
                    if (i21 > 0) {
                        i20 += gVar.f50718Y0 + iA1;
                    }
                    aVar.b(eVar2);
                    i21++;
                    i16 = i12;
                    i13 = i22;
                    gVar2 = gVar;
                }
                i20 = iA1;
                aVar.b(eVar2);
                i21++;
                i16 = i12;
                i13 = i22;
                gVar2 = gVar;
            }
        }
        g gVar3 = gVar2;
        int size = gVar3.f50724e1.size();
        d dVar2 = gVar3.f50603B;
        d dVar3 = gVar3.f50604C;
        d dVar4 = gVar3.f50605D;
        d dVar5 = gVar3.f50606E;
        int iP0 = gVar3.P0();
        int iR0 = gVar3.R0();
        int iQ0 = gVar3.Q0();
        int iO0 = gVar3.O0();
        e.b bVarY = gVar3.y();
        e.b bVar = e.b.WRAP_CONTENT;
        boolean z11 = bVarY == bVar || gVar3.M() == bVar;
        if (i13 > 0 && z11) {
            for (int i23 = 0; i23 < size; i23++) {
                a aVar2 = (a) gVar3.f50724e1.get(i23);
                if (i11 == 0) {
                    aVar2.g(i12 - aVar2.f());
                } else {
                    aVar2.g(i12 - aVar2.e());
                }
            }
        }
        d dVar6 = dVar2;
        int iO1 = iO0;
        int i24 = 0;
        int iQ1 = iQ0;
        int i25 = iR0;
        int i26 = iP0;
        d dVar7 = dVar5;
        d dVar8 = dVar4;
        d dVar9 = dVar3;
        int i27 = 0;
        for (int i28 = 0; i28 < size; i28++) {
            a aVar3 = (a) gVar3.f50724e1.get(i28);
            if (i11 == 0) {
                if (i28 < size - 1) {
                    dVar7 = ((a) gVar3.f50724e1.get(i28 + 1)).f50731b.f50604C;
                    iO1 = 0;
                } else {
                    dVar7 = gVar3.f50606E;
                    iO1 = gVar3.O0();
                }
                d dVar10 = aVar3.f50731b.f50606E;
                int i29 = i27;
                aVar3.j(i11, dVar6, dVar9, dVar8, dVar7, i26, i25, iQ1, iO1, i12);
                int iMax = Math.max(i24, aVar3.f());
                int iE = aVar3.e() + i29;
                if (i28 > 0) {
                    iE += gVar3.f50718Y0;
                }
                i27 = iE;
                i24 = iMax;
                dVar9 = dVar10;
                i25 = 0;
            } else {
                int i30 = i24;
                int i31 = i27;
                if (i28 < size - 1) {
                    dVar = ((a) gVar3.f50724e1.get(i28 + 1)).f50731b.f50603B;
                    iQ1 = 0;
                } else {
                    dVar = gVar3.f50605D;
                    iQ1 = gVar3.Q0();
                }
                dVar8 = dVar;
                d dVar11 = aVar3.f50731b.f50605D;
                aVar3.j(i11, dVar6, dVar9, dVar8, dVar7, i26, i25, iQ1, iO1, i12);
                int iF = aVar3.f() + i30;
                int iMax2 = Math.max(i31, aVar3.e());
                if (i28 > 0) {
                    iF += gVar3.f50717X0;
                }
                int i32 = iF;
                i27 = iMax2;
                i24 = i32;
                i26 = 0;
                dVar6 = dVar11;
            }
        }
        iArr[0] = i24;
        iArr[1] = i27;
    }

    private void E1(e[] eVarArr, int i10, int i11, int i12, int[] iArr) {
        a aVar;
        if (i10 == 0) {
            return;
        }
        if (this.f50724e1.size() == 0) {
            aVar = new a(i11, this.f50603B, this.f50604C, this.f50605D, this.f50606E, i12);
            this.f50724e1.add(aVar);
        } else {
            a aVar2 = (a) this.f50724e1.get(0);
            aVar2.c();
            aVar2.j(i11, this.f50603B, this.f50604C, this.f50605D, this.f50606E, P0(), R0(), Q0(), O0(), i12);
            aVar = aVar2;
        }
        for (int i13 = 0; i13 < i10; i13++) {
            aVar.b(eVarArr[i13]);
        }
        iArr[0] = aVar.f();
        iArr[1] = aVar.e();
    }

    private void z1(boolean z9) {
        e eVar;
        if (this.f50727h1 == null || this.f50726g1 == null || this.f50725f1 == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f50729j1; i10++) {
            this.f50728i1[i10].Z();
        }
        int[] iArr = this.f50727h1;
        int i11 = iArr[0];
        int i12 = iArr[1];
        e eVar2 = null;
        for (int i13 = 0; i13 < i11; i13++) {
            e eVar3 = this.f50726g1[z9 ? (i11 - i13) - 1 : i13];
            if (eVar3 != null && eVar3.O() != 8) {
                if (i13 == 0) {
                    eVar3.j(eVar3.f50603B, this.f50603B, P0());
                    eVar3.j0(this.f50705L0);
                    eVar3.i0(this.f50711R0);
                }
                if (i13 == i11 - 1) {
                    eVar3.j(eVar3.f50605D, this.f50605D, Q0());
                }
                if (i13 > 0) {
                    eVar3.j(eVar3.f50603B, eVar2.f50605D, this.f50717X0);
                    eVar2.j(eVar2.f50605D, eVar3.f50603B, 0);
                }
                eVar2 = eVar3;
            }
        }
        for (int i14 = 0; i14 < i12; i14++) {
            e eVar4 = this.f50725f1[i14];
            if (eVar4 != null && eVar4.O() != 8) {
                if (i14 == 0) {
                    eVar4.j(eVar4.f50604C, this.f50604C, R0());
                    eVar4.y0(this.f50706M0);
                    eVar4.x0(this.f50712S0);
                }
                if (i14 == i12 - 1) {
                    eVar4.j(eVar4.f50606E, this.f50606E, O0());
                }
                if (i14 > 0) {
                    eVar4.j(eVar4.f50604C, eVar2.f50606E, this.f50718Y0);
                    eVar2.j(eVar2.f50606E, eVar4.f50604C, 0);
                }
                eVar2 = eVar4;
            }
        }
        for (int i15 = 0; i15 < i11; i15++) {
            for (int i16 = 0; i16 < i12; i16++) {
                int i17 = (i16 * i11) + i15;
                if (this.f50723d1 == 1) {
                    i17 = (i15 * i12) + i16;
                }
                e[] eVarArr = this.f50728i1;
                if (i17 < eVarArr.length && (eVar = eVarArr[i17]) != null && eVar.O() != 8) {
                    e eVar5 = this.f50726g1[i15];
                    e eVar6 = this.f50725f1[i16];
                    if (eVar != eVar5) {
                        eVar.j(eVar.f50603B, eVar5.f50603B, 0);
                        eVar.j(eVar.f50605D, eVar5.f50605D, 0);
                    }
                    if (eVar != eVar6) {
                        eVar.j(eVar.f50604C, eVar6.f50604C, 0);
                        eVar.j(eVar.f50606E, eVar6.f50606E, 0);
                    }
                }
            }
        }
    }

    public void F1(float f10) {
        this.f50713T0 = f10;
    }

    public void G1(int i10) {
        this.f50707N0 = i10;
    }

    public void H1(float f10) {
        this.f50714U0 = f10;
    }

    public void I1(int i10) {
        this.f50708O0 = i10;
    }

    public void J1(int i10) {
        this.f50719Z0 = i10;
    }

    public void K1(float f10) {
        this.f50711R0 = f10;
    }

    public void L1(int i10) {
        this.f50717X0 = i10;
    }

    public void M1(int i10) {
        this.f50705L0 = i10;
    }

    public void N1(float f10) {
        this.f50715V0 = f10;
    }

    public void O1(int i10) {
        this.f50709P0 = i10;
    }

    public void P1(float f10) {
        this.f50716W0 = f10;
    }

    public void Q1(int i10) {
        this.f50710Q0 = i10;
    }

    public void R1(int i10) {
        this.f50722c1 = i10;
    }

    @Override // p240y.l
    public void S0(int i10, int i11, int i12, int i13) {
        int i14;
        e[] eVarArr;
        if (this.f50756x0 > 0 && !U0()) {
            X0(0, 0);
            W0(false);
            return;
        }
        int iP0 = P0();
        int iQ0 = Q0();
        int iR0 = R0();
        int iO0 = O0();
        int[] iArr = new int[2];
        int i15 = (i11 - iP0) - iQ0;
        int i16 = this.f50723d1;
        if (i16 == 1) {
            i15 = (i13 - iR0) - iO0;
        }
        int i17 = i15;
        if (i16 == 0) {
            if (this.f50705L0 == -1) {
                this.f50705L0 = 0;
            }
            if (this.f50706M0 == -1) {
                this.f50706M0 = 0;
            }
        } else {
            if (this.f50705L0 == -1) {
                this.f50705L0 = 0;
            }
            if (this.f50706M0 == -1) {
                this.f50706M0 = 0;
            }
        }
        e[] eVarArr2 = this.f50755w0;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            i14 = this.f50756x0;
            if (i18 >= i14) {
                break;
            }
            if (this.f50755w0[i18].O() == 8) {
                i19++;
            }
            i18++;
        }
        if (i19 > 0) {
            e[] eVarArr3 = new e[i14 - i19];
            int i20 = 0;
            i14 = 0;
            while (i20 < this.f50756x0) {
                e eVar = this.f50755w0[i20];
                e[] eVarArr4 = eVarArr3;
                if (eVar.O() != 8) {
                    eVarArr4[i14] = eVar;
                    i14++;
                }
                i20++;
                eVarArr3 = eVarArr4;
            }
            eVarArr = eVarArr3;
        } else {
            eVarArr = eVarArr2;
        }
        int i21 = i14;
        this.f50728i1 = eVarArr;
        this.f50729j1 = i21;
        int i22 = this.f50721b1;
        if (i22 == 0) {
            E1(eVarArr, i21, this.f50723d1, i17, iArr);
        } else if (i22 == 1) {
            D1(eVarArr, i21, this.f50723d1, i17, iArr);
        } else if (i22 == 2) {
            C1(eVarArr, i21, this.f50723d1, i17, iArr);
        }
        int iMin = iArr[0] + iP0 + iQ0;
        int iMin2 = iArr[1] + iR0 + iO0;
        if (i10 == 1073741824) {
            iMin = i11;
        } else if (i10 == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, i11);
        } else if (i10 != 0) {
            iMin = 0;
        }
        if (i12 == 1073741824) {
            iMin2 = i13;
        } else if (i12 == Integer.MIN_VALUE) {
            iMin2 = Math.min(iMin2, i13);
        } else if (i12 != 0) {
            iMin2 = 0;
        }
        X0(iMin, iMin2);
        E0(iMin);
        h0(iMin2);
        W0(this.f50756x0 > 0);
    }

    public void S1(int i10) {
        this.f50723d1 = i10;
    }

    public void T1(int i10) {
        this.f50720a1 = i10;
    }

    public void U1(float f10) {
        this.f50712S0 = f10;
    }

    public void V1(int i10) {
        this.f50718Y0 = i10;
    }

    public void W1(int i10) {
        this.f50706M0 = i10;
    }

    public void X1(int i10) {
        this.f50721b1 = i10;
    }

    @Override // p240y.e
    public void f(d dVar) {
        super.f(dVar);
        boolean zA1 = G() != null ? ((f) G()).a1() : false;
        int i10 = this.f50721b1;
        if (i10 != 0) {
            if (i10 == 1) {
                int size = this.f50724e1.size();
                int i11 = 0;
                while (i11 < size) {
                    ((a) this.f50724e1.get(i11)).d(zA1, i11, i11 == size + (-1));
                    i11++;
                }
            } else if (i10 == 2) {
                z1(zA1);
            }
        } else if (this.f50724e1.size() > 0) {
            ((a) this.f50724e1.get(0)).d(zA1, 0, true);
        }
        W0(false);
    }
}

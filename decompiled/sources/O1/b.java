package O1;

import android.util.Log;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private f f3915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private u f3916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f3917c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f3919b;

        static {
            int[] iArr = new int[j.values().length];
            f3919b = iArr;
            try {
                iArr[j.first_child.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3919b[j.last_child.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3919b[j.only_child.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3919b[j.first_of_type.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3919b[j.last_of_type.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3919b[j.only_of_type.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3919b[j.root.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3919b[j.empty.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3919b[j.nth_child.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3919b[j.nth_last_child.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f3919b[j.nth_of_type.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f3919b[j.nth_last_of_type.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f3919b[j.not.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f3919b[j.target.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f3919b[j.lang.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f3919b[j.link.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f3919b[j.visited.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f3919b[j.hover.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f3919b[j.active.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f3919b[j.focus.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f3919b[j.enabled.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f3919b[j.disabled.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f3919b[j.checked.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f3919b[j.indeterminate.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            int[] iArr2 = new int[c.values().length];
            f3918a = iArr2;
            try {
                iArr2[c.EQUALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f3918a[c.INCLUDES.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f3918a[c.DASHMATCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: renamed from: O1.b$b, reason: collision with other inner class name */
    private static class C0070b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final c f3921b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f3922c;

        C0070b(String str, c cVar, String str2) {
            this.f3920a = str;
            this.f3921b = cVar;
            this.f3922c = str2;
        }
    }

    private enum c {
        EXISTS,
        EQUALS,
        INCLUDES,
        DASHMATCH
    }

    private static class d extends O1.k.i {

        private static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f3928a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f3929b;

            a(int i10, int i11) {
                this.f3928a = i10;
                this.f3929b = i11;
            }
        }

        d(String str) {
            super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
        }

        private int C(int i10) {
            if (i10 >= 48 && i10 <= 57) {
                return i10 - 48;
            }
            if (i10 >= 65 && i10 <= 70) {
                return i10 - 55;
            }
            if (i10 < 97 || i10 > 102) {
                return -1;
            }
            return i10 - 87;
        }

        private a D() {
            O1.c cVarC;
            a aVar;
            if (h()) {
                return null;
            }
            int i10 = this.f4457b;
            if (!f('(')) {
                return null;
            }
            A();
            int i11 = 1;
            if (g("odd")) {
                aVar = new a(2, 1);
            } else {
                if (g("even")) {
                    aVar = new a(2, 0);
                } else {
                    int i12 = (!f('+') && f('-')) ? -1 : 1;
                    O1.c cVarC2 = O1.c.c(this.f4456a, this.f4457b, this.f4458c, false);
                    if (cVarC2 != null) {
                        this.f4457b = cVarC2.a();
                    }
                    if (f('n') || f('N')) {
                        if (cVarC2 == null) {
                            cVarC2 = new O1.c(1L, this.f4457b);
                        }
                        A();
                        boolean zF = f('+');
                        if (!zF && (zF = f('-'))) {
                            i11 = -1;
                        }
                        if (zF) {
                            A();
                            cVarC = O1.c.c(this.f4456a, this.f4457b, this.f4458c, false);
                            if (cVarC == null) {
                                this.f4457b = i10;
                                return null;
                            }
                            this.f4457b = cVarC.a();
                            int i13 = i11;
                            i11 = i12;
                            i12 = i13;
                        } else {
                            int i14 = i11;
                            i11 = i12;
                            i12 = i14;
                            cVarC = null;
                        }
                    } else {
                        cVarC = cVarC2;
                        cVarC2 = null;
                    }
                    aVar = new a(cVarC2 == null ? 0 : i11 * cVarC2.d(), cVarC != null ? i12 * cVarC.d() : 0);
                }
            }
            A();
            if (f(')')) {
                return aVar;
            }
            this.f4457b = i10;
            return null;
        }

        private String E() {
            if (h()) {
                return null;
            }
            String strQ = q();
            return strQ != null ? strQ : H();
        }

        private List G() {
            if (h()) {
                return null;
            }
            int i10 = this.f4457b;
            if (!f('(')) {
                return null;
            }
            A();
            ArrayList arrayList = null;
            do {
                String strH = H();
                if (strH == null) {
                    this.f4457b = i10;
                    return null;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(strH);
                A();
            } while (z());
            if (f(')')) {
                return arrayList;
            }
            this.f4457b = i10;
            return null;
        }

        private List K() {
            List list;
            List list2;
            if (h()) {
                return null;
            }
            int i10 = this.f4457b;
            if (!f('(')) {
                return null;
            }
            A();
            List listL = L();
            if (listL == null) {
                this.f4457b = i10;
                return null;
            }
            if (!f(')')) {
                this.f4457b = i10;
                return null;
            }
            Iterator it = listL.iterator();
            while (it.hasNext() && (list = ((s) it.next()).f3987a) != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext() && (list2 = ((t) it2.next()).f3992d) != null) {
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        if (((g) it3.next()) instanceof k) {
                            return null;
                        }
                    }
                }
            }
            return listL;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public List L() {
            a aVar = null;
            if (h()) {
                return null;
            }
            ArrayList arrayList = new ArrayList(1);
            s sVar = new s(aVar);
            while (!h() && M(sVar)) {
                if (z()) {
                    arrayList.add(sVar);
                    sVar = new s(aVar);
                }
            }
            if (!sVar.f()) {
                arrayList.add(sVar);
            }
            return arrayList;
        }

        private void O(s sVar, t tVar) throws O1.a {
            g gVar;
            g hVar;
            g gVar2;
            String strH = H();
            if (strH == null) {
                throw new O1.a("Invalid pseudo class");
            }
            j jVarC = j.c(strH);
            a aVar = null;
            switch (a.f3919b[jVarC.ordinal()]) {
                case 1:
                    g hVar2 = new h(0, 1, true, false, null);
                    sVar.b();
                    gVar2 = hVar2;
                    gVar = gVar2;
                    tVar.b(gVar);
                    return;
                case 2:
                    g hVar3 = new h(0, 1, false, false, null);
                    sVar.b();
                    gVar = hVar3;
                    tVar.b(gVar);
                    return;
                case 3:
                    g mVar = new m(false, null);
                    sVar.b();
                    gVar = mVar;
                    tVar.b(gVar);
                    return;
                case 4:
                    hVar = new h(0, 1, true, true, tVar.f3990b);
                    sVar.b();
                    gVar = hVar;
                    tVar.b(gVar);
                    return;
                case 5:
                    g hVar4 = new h(0, 1, false, true, tVar.f3990b);
                    sVar.b();
                    gVar = hVar4;
                    tVar.b(gVar);
                    return;
                case 6:
                    g mVar2 = new m(true, tVar.f3990b);
                    sVar.b();
                    gVar = mVar2;
                    tVar.b(gVar);
                    return;
                case 7:
                    g nVar = new n(aVar);
                    sVar.b();
                    gVar = nVar;
                    tVar.b(gVar);
                    return;
                case 8:
                    g iVar = new i(aVar);
                    sVar.b();
                    gVar = iVar;
                    tVar.b(gVar);
                    return;
                case 9:
                case 10:
                case 11:
                case 12:
                    boolean z9 = jVarC == j.nth_child || jVarC == j.nth_of_type;
                    boolean z10 = jVarC == j.nth_of_type || jVarC == j.nth_last_of_type;
                    a aVarD = D();
                    if (aVarD == null) {
                        throw new O1.a("Invalid or missing parameter section for pseudo class: " + strH);
                    }
                    hVar = new h(aVarD.f3928a, aVarD.f3929b, z9, z10, tVar.f3990b);
                    sVar.b();
                    gVar = hVar;
                    tVar.b(gVar);
                    return;
                case 13:
                    List listK = K();
                    if (listK == null) {
                        throw new O1.a("Invalid or missing parameter section for pseudo class: " + strH);
                    }
                    k kVar = new k(listK);
                    sVar.f3988b = kVar.b();
                    gVar2 = kVar;
                    gVar = gVar2;
                    tVar.b(gVar);
                    return;
                case 14:
                    g oVar = new o(aVar);
                    sVar.b();
                    gVar = oVar;
                    tVar.b(gVar);
                    return;
                case 15:
                    G();
                    g lVar = new l(strH);
                    sVar.b();
                    gVar = lVar;
                    tVar.b(gVar);
                    return;
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    g lVar2 = new l(strH);
                    sVar.b();
                    gVar = lVar2;
                    tVar.b(gVar);
                    return;
                default:
                    throw new O1.a("Unsupported pseudo class: " + strH);
            }
        }

        private int P() {
            int i10;
            if (h()) {
                return this.f4457b;
            }
            int i11 = this.f4457b;
            int iCharAt = this.f4456a.charAt(i11);
            if (iCharAt == 45) {
                iCharAt = a();
            }
            if ((iCharAt < 65 || iCharAt > 90) && ((iCharAt < 97 || iCharAt > 122) && iCharAt != 95)) {
                i10 = i11;
            } else {
                int iA = a();
                while (true) {
                    if ((iA < 65 || iA > 90) && ((iA < 97 || iA > 122) && !((iA >= 48 && iA <= 57) || iA == 45 || iA == 95))) {
                        break;
                    }
                    iA = a();
                }
                i10 = this.f4457b;
            }
            this.f4457b = i11;
            return i10;
        }

        String F() {
            int iC;
            if (h()) {
                return null;
            }
            char cCharAt = this.f4456a.charAt(this.f4457b);
            if (cCharAt != '\'' && cCharAt != '\"') {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            this.f4457b++;
            int iIntValue = l().intValue();
            while (iIntValue != -1 && iIntValue != cCharAt) {
                if (iIntValue == 92) {
                    iIntValue = l().intValue();
                    if (iIntValue != -1) {
                        if (iIntValue == 10 || iIntValue == 13 || iIntValue == 12) {
                            iIntValue = l().intValue();
                        } else {
                            int iC2 = C(iIntValue);
                            if (iC2 != -1) {
                                for (int i10 = 1; i10 <= 5 && (iC = C((iIntValue = l().intValue()))) != -1; i10++) {
                                    iC2 = (iC2 * 16) + iC;
                                }
                                sb.append((char) iC2);
                            }
                        }
                    }
                }
                sb.append((char) iIntValue);
                iIntValue = l().intValue();
            }
            return sb.toString();
        }

        String H() {
            int iP = P();
            int i10 = this.f4457b;
            if (iP == i10) {
                return null;
            }
            String strSubstring = this.f4456a.substring(i10, iP);
            this.f4457b = iP;
            return strSubstring;
        }

        String I() {
            char cCharAt;
            int iC;
            StringBuilder sb = new StringBuilder();
            while (!h() && (cCharAt = this.f4456a.charAt(this.f4457b)) != '\'' && cCharAt != '\"' && cCharAt != '(' && cCharAt != ')' && !k(cCharAt) && !Character.isISOControl((int) cCharAt)) {
                this.f4457b++;
                if (cCharAt == '\\') {
                    if (!h()) {
                        String str = this.f4456a;
                        int i10 = this.f4457b;
                        this.f4457b = i10 + 1;
                        cCharAt = str.charAt(i10);
                        if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\f') {
                            int iC2 = C(cCharAt);
                            if (iC2 != -1) {
                                for (int i11 = 1; i11 <= 5 && !h() && (iC = C(this.f4456a.charAt(this.f4457b))) != -1; i11++) {
                                    this.f4457b++;
                                    iC2 = (iC2 * 16) + iC;
                                }
                                sb.append((char) iC2);
                            }
                        }
                    }
                }
                sb.append(cCharAt);
            }
            if (sb.length() == 0) {
                return null;
            }
            return sb.toString();
        }

        String J() {
            if (h()) {
                return null;
            }
            int i10 = this.f4457b;
            int iCharAt = this.f4456a.charAt(i10);
            int i11 = i10;
            while (iCharAt != -1 && iCharAt != 59 && iCharAt != 125 && iCharAt != 33 && !j(iCharAt)) {
                if (!k(iCharAt)) {
                    i11 = this.f4457b + 1;
                }
                iCharAt = a();
            }
            if (this.f4457b > i10) {
                return this.f4456a.substring(i10, i11);
            }
            this.f4457b = i10;
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x002d  */
        boolean M(s sVar) throws O1.a {
            e eVar;
            t tVar;
            c cVar;
            String strE;
            if (h()) {
                return false;
            }
            int i10 = this.f4457b;
            if (sVar.f()) {
                eVar = null;
            } else if (f('>')) {
                eVar = e.CHILD;
                A();
            } else if (f('+')) {
                eVar = e.FOLLOWS;
                A();
            } else {
                eVar = null;
            }
            if (f('*')) {
                tVar = new t(eVar, null);
            } else {
                String strH = H();
                if (strH != null) {
                    t tVar2 = new t(eVar, strH);
                    sVar.c();
                    tVar = tVar2;
                } else {
                    tVar = null;
                }
            }
            while (!h()) {
                if (!f('.')) {
                    if (!f('#')) {
                        if (!f('[')) {
                            if (!f(':')) {
                                break;
                            }
                            if (tVar == null) {
                                tVar = new t(eVar, null);
                            }
                            O(sVar, tVar);
                        } else {
                            if (tVar == null) {
                                tVar = new t(eVar, null);
                            }
                            A();
                            String strH2 = H();
                            if (strH2 == null) {
                                throw new O1.a("Invalid attribute simpleSelectors");
                            }
                            A();
                            if (f('=')) {
                                cVar = c.EQUALS;
                            } else if (g("~=")) {
                                cVar = c.INCLUDES;
                            } else {
                                cVar = g("|=") ? c.DASHMATCH : null;
                            }
                            if (cVar != null) {
                                A();
                                strE = E();
                                if (strE == null) {
                                    throw new O1.a("Invalid attribute simpleSelectors");
                                }
                                A();
                            } else {
                                strE = null;
                            }
                            if (!f(']')) {
                                throw new O1.a("Invalid attribute simpleSelectors");
                            }
                            if (cVar == null) {
                                cVar = c.EXISTS;
                            }
                            tVar.a(strH2, cVar, strE);
                            sVar.b();
                        }
                    } else {
                        if (tVar == null) {
                            tVar = new t(eVar, null);
                        }
                        String strH3 = H();
                        if (strH3 == null) {
                            throw new O1.a("Invalid \"#id\" simpleSelectors");
                        }
                        tVar.a("id", c.EQUALS, strH3);
                        sVar.d();
                    }
                } else {
                    if (tVar == null) {
                        tVar = new t(eVar, null);
                    }
                    String strH4 = H();
                    if (strH4 == null) {
                        throw new O1.a("Invalid \".class\" simpleSelectors");
                    }
                    tVar.a("class", c.EQUALS, strH4);
                    sVar.b();
                }
            }
            if (tVar != null) {
                sVar.a(tVar);
                return true;
            }
            this.f4457b = i10;
            return false;
        }

        String N() {
            if (h()) {
                return null;
            }
            int i10 = this.f4457b;
            if (!g("url(")) {
                return null;
            }
            A();
            String strF = F();
            if (strF == null) {
                strF = I();
            }
            if (strF == null) {
                this.f4457b = i10;
                return null;
            }
            A();
            if (h() || g(")")) {
                return strF;
            }
            this.f4457b = i10;
            return null;
        }
    }

    private enum e {
        DESCENDANT,
        CHILD,
        FOLLOWS
    }

    enum f {
        all,
        aural,
        braille,
        embossed,
        handheld,
        print,
        projection,
        screen,
        speech,
        tty,
        tv
    }

    private interface g {
        boolean a(q qVar, O1.g.L l10);
    }

    private static class h implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f3946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f3947b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f3948c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f3949d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f3950e;

        h(int i10, int i11, boolean z9, boolean z10, String str) {
            this.f3946a = i10;
            this.f3947b = i11;
            this.f3948c = z9;
            this.f3949d = z10;
            this.f3950e = str;
        }

        @Override // O1.b.g
        public boolean a(q qVar, O1.g.L l10) {
            int i10;
            int i11;
            String strN = (this.f3949d && this.f3950e == null) ? l10.n() : this.f3950e;
            O1.g.J j10 = l10.f4147b;
            if (j10 != null) {
                Iterator it = j10.a().iterator();
                i10 = 0;
                i11 = 0;
                while (it.hasNext()) {
                    O1.g.L l11 = (O1.g.L) ((O1.g.N) it.next());
                    if (l11 == l10) {
                        i10 = i11;
                    }
                    if (strN == null || l11.n().equals(strN)) {
                        i11++;
                    }
                }
            } else {
                i10 = 0;
                i11 = 1;
            }
            int i12 = this.f3948c ? i10 + 1 : i11 - i10;
            int i13 = this.f3946a;
            if (i13 == 0) {
                return i12 == this.f3947b;
            }
            int i14 = this.f3947b;
            return (i12 - i14) % i13 == 0 && (Integer.signum(i12 - i14) == 0 || Integer.signum(i12 - this.f3947b) == Integer.signum(this.f3946a));
        }

        public String toString() {
            String str = this.f3948c ? "" : "last-";
            return this.f3949d ? String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(this.f3946a), Integer.valueOf(this.f3947b), this.f3950e) : String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(this.f3946a), Integer.valueOf(this.f3947b));
        }
    }

    private static class i implements g {
        private i() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // O1.b.g
        public boolean a(q qVar, O1.g.L l10) {
            return !(l10 instanceof O1.g.J) || ((O1.g.J) l10).a().size() == 0;
        }

        public String toString() {
            return "empty";
        }

        /* synthetic */ i(a aVar) {
            this();
        }
    }

    private enum j {
        target,
        root,
        nth_child,
        nth_last_child,
        nth_of_type,
        nth_last_of_type,
        first_child,
        last_child,
        first_of_type,
        last_of_type,
        only_child,
        only_of_type,
        empty,
        not,
        lang,
        link,
        visited,
        hover,
        active,
        focus,
        enabled,
        disabled,
        checked,
        indeterminate,
        UNSUPPORTED;


        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        private static final Map f3961Q = new HashMap();

        static {
            for (j jVar : values()) {
                if (jVar != UNSUPPORTED) {
                    f3961Q.put(jVar.name().replace('_', '-'), jVar);
                }
            }
        }

        public static j c(String str) {
            j jVar = (j) f3961Q.get(str);
            return jVar != null ? jVar : UNSUPPORTED;
        }
    }

    private static class k implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f3978a;

        k(List list) {
            this.f3978a = list;
        }

        @Override // O1.b.g
        public boolean a(q qVar, O1.g.L l10) {
            Iterator it = this.f3978a.iterator();
            while (it.hasNext()) {
                if (b.l(qVar, (s) it.next(), l10)) {
                    return false;
                }
            }
            return true;
        }

        int b() {
            Iterator it = this.f3978a.iterator();
            int i10 = LinearLayoutManager.INVALID_OFFSET;
            while (it.hasNext()) {
                int i11 = ((s) it.next()).f3988b;
                if (i11 > i10) {
                    i10 = i11;
                }
            }
            return i10;
        }

        public String toString() {
            return "not(" + this.f3978a + ")";
        }
    }

    private static class l implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f3979a;

        l(String str) {
            this.f3979a = str;
        }

        @Override // O1.b.g
        public boolean a(q qVar, O1.g.L l10) {
            return false;
        }

        public String toString() {
            return this.f3979a;
        }
    }

    private static class m implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f3980a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f3981b;

        public m(boolean z9, String str) {
            this.f3980a = z9;
            this.f3981b = str;
        }

        @Override // O1.b.g
        public boolean a(q qVar, O1.g.L l10) {
            int i10;
            String strN = (this.f3980a && this.f3981b == null) ? l10.n() : this.f3981b;
            O1.g.J j10 = l10.f4147b;
            if (j10 != null) {
                Iterator it = j10.a().iterator();
                i10 = 0;
                while (it.hasNext()) {
                    O1.g.L l11 = (O1.g.L) ((O1.g.N) it.next());
                    if (strN == null || l11.n().equals(strN)) {
                        i10++;
                    }
                }
            } else {
                i10 = 1;
            }
            return i10 == 1;
        }

        public String toString() {
            return this.f3980a ? String.format("only-of-type <%s>", this.f3981b) : String.format("only-child", new Object[0]);
        }
    }

    private static class n implements g {
        private n() {
        }

        @Override // O1.b.g
        public boolean a(q qVar, O1.g.L l10) {
            return l10.f4147b == null;
        }

        public String toString() {
            return "root";
        }

        /* synthetic */ n(a aVar) {
            this();
        }
    }

    private static class o implements g {
        private o() {
        }

        @Override // O1.b.g
        public boolean a(q qVar, O1.g.L l10) {
            return qVar != null && l10 == qVar.f3985a;
        }

        public String toString() {
            return "target";
        }

        /* synthetic */ o(a aVar) {
            this();
        }
    }

    static class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        s f3982a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        O1.g.E f3983b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        u f3984c;

        p(s sVar, O1.g.E e10, u uVar) {
            this.f3982a = sVar;
            this.f3983b = e10;
            this.f3984c = uVar;
        }

        public String toString() {
            return String.valueOf(this.f3982a) + " {...} (src=" + this.f3984c + ")";
        }
    }

    static class q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        O1.g.L f3985a;

        q() {
        }

        public String toString() {
            O1.g.L l10 = this.f3985a;
            return l10 != null ? String.format("<%s id=\"%s\">", l10.n(), this.f3985a.f4137c) : "";
        }
    }

    static class r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f3986a = null;

        r() {
        }

        void a(p pVar) {
            if (this.f3986a == null) {
                this.f3986a = new ArrayList();
            }
            for (int i10 = 0; i10 < this.f3986a.size(); i10++) {
                if (((p) this.f3986a.get(i10)).f3982a.f3988b > pVar.f3982a.f3988b) {
                    this.f3986a.add(i10, pVar);
                    return;
                }
            }
            this.f3986a.add(pVar);
        }

        void b(r rVar) {
            if (rVar.f3986a == null) {
                return;
            }
            if (this.f3986a == null) {
                this.f3986a = new ArrayList(rVar.f3986a.size());
            }
            Iterator it = rVar.f3986a.iterator();
            while (it.hasNext()) {
                a((p) it.next());
            }
        }

        List c() {
            return this.f3986a;
        }

        boolean d() {
            List list = this.f3986a;
            return list == null || list.isEmpty();
        }

        void e(u uVar) {
            List list = this.f3986a;
            if (list == null) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((p) it.next()).f3984c == uVar) {
                    it.remove();
                }
            }
        }

        int f() {
            List list = this.f3986a;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public String toString() {
            if (this.f3986a == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            Iterator it = this.f3986a.iterator();
            while (it.hasNext()) {
                sb.append(((p) it.next()).toString());
                sb.append('\n');
            }
            return sb.toString();
        }
    }

    private static class t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        e f3989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f3990b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        List f3991c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        List f3992d = null;

        t(e eVar, String str) {
            this.f3989a = null;
            this.f3990b = null;
            this.f3989a = eVar == null ? e.DESCENDANT : eVar;
            this.f3990b = str;
        }

        void a(String str, c cVar, String str2) {
            if (this.f3991c == null) {
                this.f3991c = new ArrayList();
            }
            this.f3991c.add(new C0070b(str, cVar, str2));
        }

        void b(g gVar) {
            if (this.f3992d == null) {
                this.f3992d = new ArrayList();
            }
            this.f3992d.add(gVar);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            e eVar = this.f3989a;
            if (eVar == e.CHILD) {
                sb.append("> ");
            } else if (eVar == e.FOLLOWS) {
                sb.append("+ ");
            }
            String str = this.f3990b;
            if (str == null) {
                str = "*";
            }
            sb.append(str);
            List<C0070b> list = this.f3991c;
            if (list != null) {
                for (C0070b c0070b : list) {
                    sb.append('[');
                    sb.append(c0070b.f3920a);
                    int i10 = a.f3918a[c0070b.f3921b.ordinal()];
                    if (i10 == 1) {
                        sb.append('=');
                        sb.append(c0070b.f3922c);
                    } else if (i10 == 2) {
                        sb.append("~=");
                        sb.append(c0070b.f3922c);
                    } else if (i10 == 3) {
                        sb.append("|=");
                        sb.append(c0070b.f3922c);
                    }
                    sb.append(']');
                }
            }
            List<g> list2 = this.f3992d;
            if (list2 != null) {
                for (g gVar : list2) {
                    sb.append(':');
                    sb.append(gVar);
                }
            }
            return sb.toString();
        }
    }

    enum u {
        Document,
        RenderOptions
    }

    b(u uVar) {
        this(f.screen, uVar);
    }

    private static int a(List list, int i10, O1.g.L l10) {
        int i11 = 0;
        if (i10 < 0) {
            return 0;
        }
        Object obj = list.get(i10);
        O1.g.J j10 = l10.f4147b;
        if (obj != j10) {
            return -1;
        }
        Iterator it = j10.a().iterator();
        while (it.hasNext()) {
            if (((O1.g.N) it.next()) == l10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    static boolean b(String str, f fVar) {
        d dVar = new d(str);
        dVar.A();
        return c(h(dVar), fVar);
    }

    private static boolean c(List list, f fVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f fVar2 = (f) it.next();
            if (fVar2 == f.all || fVar2 == fVar) {
                return true;
            }
        }
        return false;
    }

    private void e(r rVar, d dVar) throws O1.a {
        String strH = dVar.H();
        dVar.A();
        if (strH == null) {
            throw new O1.a("Invalid '@' rule");
        }
        if (!this.f3917c && strH.equals("media")) {
            List listH = h(dVar);
            if (!dVar.f('{')) {
                throw new O1.a("Invalid @media rule: missing rule set");
            }
            dVar.A();
            if (c(listH, this.f3915a)) {
                this.f3917c = true;
                rVar.b(j(dVar));
                this.f3917c = false;
            } else {
                j(dVar);
            }
            if (!dVar.h() && !dVar.f('}')) {
                throw new O1.a("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.f3917c || !strH.equals("import")) {
            p("Ignoring @%s rule", strH);
            o(dVar);
        } else {
            String strN = dVar.N();
            if (strN == null) {
                strN = dVar.F();
            }
            if (strN == null) {
                throw new O1.a("Invalid @import rule: expected string or url()");
            }
            dVar.A();
            h(dVar);
            if (!dVar.h() && !dVar.f(';')) {
                throw new O1.a("Invalid @media rule: expected '}' at end of rule set");
            }
            O1.g.k();
        }
        dVar.A();
    }

    public static List f(String str) {
        d dVar = new d(str);
        ArrayList arrayList = null;
        while (!dVar.h()) {
            String strR = dVar.r();
            if (strR != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(strR);
                dVar.A();
            }
        }
        return arrayList;
    }

    private O1.g.E g(d dVar) throws O1.a {
        O1.g.E e10 = new O1.g.E();
        do {
            String strH = dVar.H();
            dVar.A();
            if (!dVar.f(':')) {
                throw new O1.a("Expected ':'");
            }
            dVar.A();
            String strJ = dVar.J();
            if (strJ == null) {
                throw new O1.a("Expected property value");
            }
            dVar.A();
            if (dVar.f('!')) {
                dVar.A();
                if (!dVar.g("important")) {
                    throw new O1.a("Malformed rule set: found unexpected '!'");
                }
                dVar.A();
            }
            dVar.f(';');
            O1.k.S0(e10, strH, strJ);
            dVar.A();
            if (dVar.h()) {
                break;
            }
        } while (!dVar.f('}'));
        return e10;
    }

    private static List h(d dVar) {
        String strW;
        ArrayList arrayList = new ArrayList();
        while (!dVar.h() && (strW = dVar.w()) != null) {
            try {
                arrayList.add(f.valueOf(strW));
            } catch (IllegalArgumentException unused) {
            }
            if (!dVar.z()) {
                break;
            }
        }
        return arrayList;
    }

    private boolean i(r rVar, d dVar) throws O1.a {
        List listL = dVar.L();
        if (listL == null || listL.isEmpty()) {
            return false;
        }
        if (!dVar.f('{')) {
            throw new O1.a("Malformed rule block: expected '{'");
        }
        dVar.A();
        O1.g.E eG = g(dVar);
        dVar.A();
        Iterator it = listL.iterator();
        while (it.hasNext()) {
            rVar.a(new p((s) it.next(), eG, this.f3916b));
        }
        return true;
    }

    private r j(d dVar) {
        r rVar = new r();
        while (!dVar.h()) {
            try {
                if (!dVar.g("<!--") && !dVar.g("-->")) {
                    if (!dVar.f('@')) {
                        if (!i(rVar, dVar)) {
                            break;
                        }
                    } else {
                        e(rVar, dVar);
                    }
                }
            } catch (O1.a e10) {
                Log.e("CSSParser", "CSS parser terminated early due to error: " + e10.getMessage());
                return rVar;
            }
        }
        return rVar;
    }

    private static boolean k(q qVar, s sVar, int i10, List list, int i11, O1.g.L l10) {
        t tVarE = sVar.e(i10);
        if (!n(qVar, tVarE, list, i11, l10)) {
            return false;
        }
        e eVar = tVarE.f3989a;
        if (eVar == e.DESCENDANT) {
            if (i10 == 0) {
                return true;
            }
            while (i11 >= 0) {
                if (m(qVar, sVar, i10 - 1, list, i11)) {
                    return true;
                }
                i11--;
            }
            return false;
        }
        if (eVar == e.CHILD) {
            return m(qVar, sVar, i10 - 1, list, i11);
        }
        int iA = a(list, i11, l10);
        if (iA <= 0) {
            return false;
        }
        return k(qVar, sVar, i10 - 1, list, i11, (O1.g.L) l10.f4147b.a().get(iA - 1));
    }

    static boolean l(q qVar, s sVar, O1.g.L l10) {
        ArrayList arrayList = new ArrayList();
        for (Object obj = l10.f4147b; obj != null; obj = ((O1.g.N) obj).f4147b) {
            arrayList.add(0, obj);
        }
        int size = arrayList.size() - 1;
        return sVar.g() == 1 ? n(qVar, sVar.e(0), arrayList, size, l10) : k(qVar, sVar, sVar.g() - 1, arrayList, size, l10);
    }

    private static boolean m(q qVar, s sVar, int i10, List list, int i11) {
        t tVarE = sVar.e(i10);
        O1.g.L l10 = (O1.g.L) list.get(i11);
        if (!n(qVar, tVarE, list, i11, l10)) {
            return false;
        }
        e eVar = tVarE.f3989a;
        if (eVar == e.DESCENDANT) {
            if (i10 == 0) {
                return true;
            }
            while (i11 > 0) {
                i11--;
                if (m(qVar, sVar, i10 - 1, list, i11)) {
                    return true;
                }
            }
            return false;
        }
        if (eVar == e.CHILD) {
            return m(qVar, sVar, i10 - 1, list, i11 - 1);
        }
        int iA = a(list, i11, l10);
        if (iA <= 0) {
            return false;
        }
        return k(qVar, sVar, i10 - 1, list, i11, (O1.g.L) l10.f4147b.a().get(iA - 1));
    }

    private static boolean n(q qVar, t tVar, List list, int i10, O1.g.L l10) {
        List list2;
        String str = tVar.f3990b;
        if (str != null && !str.equals(l10.n().toLowerCase(Locale.US))) {
            return false;
        }
        List<C0070b> list3 = tVar.f3991c;
        if (list3 != null) {
            for (C0070b c0070b : list3) {
                String str2 = c0070b.f3920a;
                str2.getClass();
                if (str2.equals("id")) {
                    if (!c0070b.f3922c.equals(l10.f4137c)) {
                        return false;
                    }
                } else if (!str2.equals("class") || (list2 = l10.f4141g) == null || !list2.contains(c0070b.f3922c)) {
                    return false;
                }
            }
        }
        List list4 = tVar.f3992d;
        if (list4 == null) {
            return true;
        }
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            if (!((g) it.next()).a(qVar, l10)) {
                return false;
            }
        }
        return true;
    }

    private void o(d dVar) {
        int i10 = 0;
        while (!dVar.h()) {
            int iIntValue = dVar.l().intValue();
            if (iIntValue == 59 && i10 == 0) {
                return;
            }
            if (iIntValue == 123) {
                i10++;
            } else if (iIntValue == 125 && i10 > 0 && (i10 = i10 - 1) == 0) {
                return;
            }
        }
    }

    private static void p(String str, Object... objArr) {
        Log.w("CSSParser", String.format(str, objArr));
    }

    r d(String str) {
        d dVar = new d(str);
        dVar.A();
        return j(dVar);
    }

    b(f fVar, u uVar) {
        this.f3917c = false;
        this.f3915a = fVar;
        this.f3916b = uVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        List f3987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f3988b;

        private s() {
            this.f3987a = null;
            this.f3988b = 0;
        }

        void a(t tVar) {
            if (this.f3987a == null) {
                this.f3987a = new ArrayList();
            }
            this.f3987a.add(tVar);
        }

        void b() {
            this.f3988b += 1000;
        }

        void c() {
            this.f3988b++;
        }

        void d() {
            this.f3988b += 1000000;
        }

        t e(int i10) {
            return (t) this.f3987a.get(i10);
        }

        boolean f() {
            List list = this.f3987a;
            return list == null || list.isEmpty();
        }

        int g() {
            List list = this.f3987a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Iterator it = this.f3987a.iterator();
            while (it.hasNext()) {
                sb.append((t) it.next());
                sb.append(' ');
            }
            sb.append('[');
            sb.append(this.f3988b);
            sb.append(']');
            return sb.toString();
        }

        /* synthetic */ s(a aVar) {
            this();
        }
    }
}

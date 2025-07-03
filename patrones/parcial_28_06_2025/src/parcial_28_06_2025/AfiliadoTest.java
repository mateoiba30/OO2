package parcial_28_06_2025;

public class AfiliadoTest {
	private Afiliado afiliado;
	private PlanMedico planObligatorio;
	private PlanMedico planIntegral;
	private Coseguro coseguroNulo;
	private Coseguro coseguroReal;
	
	@BeforeEach
	public setup() {
		this.planObligatorio = new PlanObligatorio(LocaDate.now());
		this.coseguroNulo = new CoseguroNulo();
		this.coseguroReal = new CoseguroReal(null, 10, LocalDate.now(), 10000);
		this.afiliado = new (planObligatorio, null, "Pedro", 2, 100000, LocalDate.of(1998,1,1), this.coseguroNulo);
	}
	
	@Test
	public calcularMontoTest() {
		assertEquals(x, this.afiliado.calcularMonto());
		
		this.afiliado.setPlanMedico(planIntegral);
		assertEquals(y, this.afiliado.calcularMonto());
		
		this.afiliado.setCoseguro(this.coseguroReal);
		assertEquals(z, this.afiliado.calcularMonto());
	}
}

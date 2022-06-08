import org.junit.Assert.*

class RemittanceupdateKtTest {

    @org.junit.Test
    fun commissionCard1() {

        val card = 1;
        val month = 75000;
        val price = 1000;

        val result = commission(
             card, month, price
        )

        assertEquals(476.0,result.toDouble(),1e-6)
    }

    @org.junit.Test
    fun commissionCard1NoCommission() {

        val card = 1;
        val month = 35000;
        val price = 1000;

        val result = commission(
            card, month, price
        )

        assertEquals(0.0,result.toDouble(),1e-6)
    }

    @org.junit.Test
    fun commissionCard2() {

        val card = 2;
        val month = 0;
        val price = 1000;

        val result = commission(
            card, month, price
        )

        assertEquals(7.5,result.toDouble(),1e-6)
    }

    @org.junit.Test
    fun commissionCard2NoCommission() {

        val card = 2;
        val month = 2;
        val price = 5;

        val result = commission(
            card, month, price
        )

        assertEquals(0.0,result.toDouble(),1e-6)
    }

    @org.junit.Test
    fun commissionCard3() {

        val card = 3;
        val month = 8000;
        val price = 2000;

        val result = commission(
            card, month, price
        )

        assertEquals(1.0,result.toDouble(),1e-6)
    }
}
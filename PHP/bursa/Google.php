<?php
/**
 * Created by IntelliJ IDEA.
 * User: Tudor
 * Date: 09-Apr-17
 * Time: 8:12 PM
 */

namespace bursa;


class Google extends Actiune
{
	static $GOOGLE = "GOOGLE";

	function __construct()
	{
		$this->pret = 57.33;
		$this->nume = Google::$GOOGLE;
	}
}
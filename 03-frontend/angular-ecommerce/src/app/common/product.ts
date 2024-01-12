export class Product {

//     id: string | undefined;
//     sku: string | undefined;
//     name: string | undefined;
//     description: string | undefined;
//     unitPrice: number | undefined;
//     imageUrl: string | undefined;
//     active: boolean | undefined;
//     unitsInStock: number | undefined;
//     dateCreated: Date | undefined;
//     lastUpdate: Date | undefined;



    constructor(
                public id: string,
                public sku: string,
                public name: string,
                public description: string,
                public unitPrice: number,
                public imageUrl: string,
                public active: boolean,
                public unitsInStock: number,
                public dateCreated: Date,
                public lastUpdated: Date  
        ){}

}
